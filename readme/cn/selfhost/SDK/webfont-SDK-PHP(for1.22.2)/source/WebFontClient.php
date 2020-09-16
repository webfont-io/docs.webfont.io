<?php

namespace source;

use source\model\FontFaceInfo;
use source\model\FontFaceParam;
use source\model\WebFontFace;
use source\model\WebFontInfo;
use OSS\OssClient;
use OSS\Core\OssException;
use Webfontsdk\FontBuildAccessKeyRequest;

class WebFontClient
{
    // 需替换用户的apiKey(apiKey是由docker-compose.yml里的WEBFONT_APIKEY定义，两者必须对应才能调用成功)
    private $apiKey = "5c051ef2-441f-4ed2-8f3b-61506da724e9";
    private $host = "localhost";
    private $port = "5000";

    //阿里云OSS配置
    private $accessKeyId = "LTAI4FswR5BVegCTm98n8DUi";
    private $accessKeySecret = "mCMs3kL6FqUI7HggVhmPn75ZkK0UhP";
    private $endpoint = "http://oss-cn-beijing.aliyuncs.com";
    private $bucket = "youziku-test";


    private $webfontStub;

    public function __construct()
    {
        $this->webfontStub = new WebfontStub($this->host . ':' . $this->port, [
            'credentials' => \Grpc\ChannelCredentials::createInsecure()
        ]);
    }

    public function getFontFace(FontFaceParam $faceParam)
    {
        try {
            //传入用户可使用的字体id和需要处理的文本，然后进行构建字体库
            $fontInfo = $this->buildfont($this->apiKey, $faceParam->getAccessKey(), $faceParam->getContent());
            // 将生成的webfont资源上传到存储空间里，并返回保存的地址，用于构建@font-face语句。
            $fontFaceInfo = $this->uploadFontFile($fontInfo, $faceParam->getUrl());
            // 设置Tag参数，Tag即是select代码，如果调用getFontFace()方法时填写此参数，则返回的@font-face语句会自动将效果引用至select上。
            $fontFaceInfo->setTag($faceParam->getTag());
            // 根据webfont资源保存的地址来生成@font-face语句。
            $webFontFace = $this->buildWebFontFace($fontFaceInfo);

            return $webFontFace;
        } catch (\Exception $e) {
        }
    }

    /**
     * 根据webfont资源保存的地址来生成@font-face语句。
     *
     * @param $fontFaceInfo
     */
    private function buildWebFontFace($fontFaceInfo)
    {
        $webFontFace = new WebFontFace();
        //定义生成的@font-face语句里的font-family属性值，本SDK默认将字体的英文名字作为@font-face语句里的font-family属性值。
        $webFontFace->setFontFamily($fontFaceInfo->getNameEn());

        $fontFace = "@font-face{font-family:'" . $fontFaceInfo->getNameEn() . "';'";

        //如果eot不为空
        if (null != $fontFaceInfo->getEotUrl() && '' != $fontFaceInfo->getEotUrl()) {
            $fontFace .= "src:url('" . $fontFaceInfo->getEotUrl() . "');";
        }

        $fontFace .= "src:";

        //如果eot不为空
        if (null != $fontFaceInfo->getEotUrl() && '' != $fontFaceInfo->getEotUrl()) {
            $fontFace .= "url('" . $fontFaceInfo->getEotUrl() . "?#iefix')format('embedded-opentype'),";

        }
        //如果woff不为空
        if (null != $fontFaceInfo->getWoffUrl() && '' != $fontFaceInfo->getWoffUrl()) {
            $fontFace .= "url('" . $fontFaceInfo->getWoffUrl() . "')format('woff'),";
        }

		//如果woff2不为空
        if (null != $fontFaceInfo->getWoff2Url() && '' != $fontFaceInfo->getWoff2Url()) {
            $fontFace .= "url('" . $fontFaceInfo->getWoff2Url() . "')format('woff2'),";
        }

        //如果ttf不为空
        if (null != $fontFaceInfo->getTtfUrl() && '' != $fontFaceInfo->getTtfUrl()) {
            $fontFace .= "url('" . $fontFaceInfo->getTtfUrl() . "')format('truetype'),";
        }

        $fontFace .= substr($fontFace, 0, -1);
        $fontFace .= ";}";

        if (null != $fontFaceInfo->getTag() && '' != $fontFaceInfo->getTag()) {
            $fontFace .= $fontFaceInfo->getTag() . "{font-family:'". $fontFaceInfo->getNameEn()."'}";
        }

//        echo $fontFace . '/n/n/n';

        $webFontFace->setFontFace($fontFace);
        $webFontFace->setTag($fontFaceInfo->getTag());
        $webFontFace->setWoff($fontFaceInfo->getWoffUrl());
        return $webFontFace;
    }

    /**
     * 将生成的webfont资源上传到存储空间里，并返回保存的地址，用于构建@font-face语句。
     *
     * @param $webFontInfo
     * @param $url          自定义保存路径
     * @return FontFaceInfo
     */
    private function uploadFontFile($webFontInfo, $url)
    {
        $objectBaseName = "";
        if (null != $url && $url != '') {
            $objectBaseName = $url;
        } else {
            $objectBaseName = 'fontface/' . $webFontInfo->getFontId() . '/' . uniqid() . '/' . $webFontInfo->getNameEn();
        }

//        echo "objectBaseName:" . $objectBaseName . '\n\n\n';

        $eotObjectName = $objectBaseName . ".eot";
        $woffObjectName = $objectBaseName . ".woff";
		$woff2ObjectName = $objectBaseName . ".woff2";
        $ttfObjectName = $objectBaseName . ".ttf";

        $eotUrlString = strlen($webFontInfo->getBytesEot()) != 0 ? $this->ossUpload($webFontInfo->getBytesEot(), $eotObjectName) : "";
        $woffUrlString = strlen($webFontInfo->getBytesWoff()) != 0 ? $this->ossUpload($webFontInfo->getBytesWoff(), $woffObjectName) : "";
        $ttfUrlString = strlen($webFontInfo->getBytesTtf()) != 0 ? $this->ossUpload($webFontInfo->getBytesTtf(), $ttfObjectName) : "";
		$woff2UrlString = strlen($webFontInfo->getBytesWoff2()) != 0 ? $this->ossUpload($webFontInfo->getBytesWoff2(), $woff2ObjectName) : "";

        $fontfaceinfo = new FontFaceInfo();
        $fontfaceinfo->setEotUrl($eotUrlString);
        $fontfaceinfo->setWoffUrl($woffUrlString);
		$fontfaceinfo->setWoff2Url($woff2UrlString);
        $fontfaceinfo->setTtfUrl($ttfUrlString);
        $fontfaceinfo->setNameEn($webFontInfo->getNameEn());

        return $fontfaceinfo;
    }

    private function buildfont($apiKey, $accessKey, $content)
    {
        $fontAccessKeyReq = new FontBuildAccessKeyRequest();
        $fontAccessKeyReq->setApikey($apiKey);
        $fontAccessKeyReq->setAccesskey($accessKey);
        $fontAccessKeyReq->setText($content);
        $fontAccessKeyReq->setNeedTtf(true);
        $fontAccessKeyReq->setNeedEot(true);
        $fontAccessKeyReq->setNeedWoff(true);
		$fontAccessKeyReq->setNeedWoff2(true);

        $res = $this->webfontStub->BuildFontForAccessKey($fontAccessKeyReq)->wait();
        list($reply, $status) = $res;
        if ($status->code != 0) {
            throw new \Exception("gRPC调用失败");
        } else {

            $info = new WebFontInfo();
            $info->setApiKey($apiKey);
            $info->setFontId($reply->getFontId());
            $info->setContent($content);
            $info->setFontCheckSum($reply->getFontChecksum());

            $info->setFontFormatVersion($reply->getFontFormatVersion());
            $info->setNameEn($reply->getNameEn());
            $info->setBytesTtf($reply->getBytesTtf());
            $info->setBytesEot($reply->getBytesEot());
            $info->setBytesWoff($reply->getBytesWoff());
			$info->setBytesWoff2($reply->getBytesWoff2());

            return $info;
        }
    }

    /**
     * 将文件上传存储空间的方法（本SDK是用阿里云OSS作为存储空间）。
     * 用户可以根据自身的情况重写该方法，重写时须注意该方法必须传入文件二进制流（byte[]）和文件名
     *
     * @param $bytes
     * @param $objName
     * @return string   返回文件的完整存储地址（SDK将使用该地址构建@font-face语句）。
     */
    private function ossUpload($bytes, $objName)
    {
        try {
            $ossClient = new OssClient($this->accessKeyId, $this->accessKeySecret, $this->endpoint);
            $ossClient->putObject($this->bucket, $objName, $bytes);

            $url = $ossClient->signUrl($this->bucket, $objName, time() + 3600 * 1000 * 24);
            $url = substr($url, 0 , strpos($url, '?'));
            return $url;
        } catch (OssException $e) {
            print $e->getMessage();
        }

    }
}