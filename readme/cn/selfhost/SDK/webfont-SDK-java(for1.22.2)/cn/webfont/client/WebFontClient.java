/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.webfont.client;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.common.utils.StringUtils;
import com.aliyun.oss.model.CannedAccessControlList;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import cn.webfont.client.model.FontFaceInfo;
import cn.webfont.client.model.FontFaceParam;
import cn.webfont.client.model.WebFontFace;
import cn.webfont.client.model.WebFontInfo;

import io.grpc.sdk.webfont.GreeterGrpc; 
import io.grpc.sdk.webfont.FontListRequest;
import io.grpc.sdk.webfont.FontListResult;
import io.grpc.sdk.webfont.FontBuildAccessKeyRequest;
import io.grpc.sdk.webfont.MultFontBuildRequest;
import io.grpc.sdk.webfont.FontBuildRequest;
import io.grpc.sdk.webfont.MultFontBuildBufResult;
import io.grpc.sdk.webfont.FontBuildBufResult;


import java.io.ByteArrayInputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebFontClient {
    private static final Logger logger = Logger.getLogger(WebFontClient.class.getName());

    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    // 需替换用户的host(部署webfont服务的服务器IP)
    private String host = "localhost";

    // 需替换用户的port(部署webfont服务的服务器的端口号)
    private int port = 5000;

    // 需替换用户的apiKey(apiKey是由docker-compose.yml里的WEBFONT_APIKEY定义，两者必须对应才能调用成功)
    private String apiKey = "5c051ef2-441f-4ed2-8f3b-61506da724e9";

    public static String longToString(long currentTime, String formatType) {
        Date date = new Date(currentTime);
        return new SimpleDateFormat(formatType).format(date);
    }

    public WebFontClient() {
        this("", 0, "");
    }

    public WebFontClient(String host, int port) {
        this(host, port, "");
    }

    public WebFontClient(String host, int port, String apiKey) {
        if (!StringUtils.isNullOrEmpty(host)) {
            this.host = host;
        }

        if (port > 0) {
            this.port = port;
        }

        if (!StringUtils.isNullOrEmpty(apiKey)) {
            this.apiKey = apiKey;
        }

        channel =
                ManagedChannelBuilder.forAddress(this.host, this.port)
                        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                        // needing certificates.
                        .usePlaintext()
                        .build();
        blockingStub = GreeterGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public List<WebFontInfo> fontlist(String apiKey) {
        FontListRequest request = FontListRequest.newBuilder().setApikey(apiKey).build();
        FontListResult response;
        try {
            response = blockingStub.fontList(request);
            List<WebFontInfo> result = new ArrayList<WebFontInfo>();
            for (Map.Entry<Integer, Long> entry : response.getFontsMap().entrySet()) {
                WebFontInfo info = new WebFontInfo();
                info.setFontId(entry.getKey().intValue());
                info.setDate(entry.getValue().longValue() * 1000); // golang中的时间戳单位是秒 java是毫秒
                result.add(info);
                logger.log(
                        Level.INFO,
                        "FontId: {0}  Expire date: {1}",
                        new Object[]{info.getFontId(), longToString(info.getDate(), "yyyy-MM-dd HH:mm:ss")});
            }
            return result;
        } catch (StatusRuntimeException e) {
            logger.log(
                    Level.WARNING,
                    "RPC failed: {0}  Desc: {1}",
                    new Object[]{e.getStatus().getCode().value(), e.getStatus().getDescription()});
            return null;
        }
    }

    /**
     * 传入用户的字体的accesskey和需要处理的文本，然后进行构建字体库
     *
     * @param apiKey    用户的apikey
     * @param accessKey 字体的accesskey
     * @param content   需要处理的文本
     * @return
     */
    public WebFontInfo buildfont(String apiKey, String accessKey, String content) {
        FontBuildAccessKeyRequest request = FontBuildAccessKeyRequest.newBuilder()
                .setApikey(apiKey)
                .setAccesskey(accessKey)
                .setText(content)
                .setNeedTtf(true)//如果不需要此格式的文件返回，则此处参数设置为false
                .setNeedEot(true)//如果不需要此格式的文件返回，则此处参数设置为false
                .setNeedWoff(true)//如果不需要此格式的文件返回，则此处参数设置为false
				.setNeedWoff2(false)//如果不需要此格式的文件返回，则此处参数设置为false
                .build();
        FontBuildBufResult response;
        try {
            response = blockingStub.buildFontForAccessKey(request);
            WebFontInfo info = new WebFontInfo();
            info.setApiKey(apiKey);
            info.setFontId(response.getFontId());
            info.setContent(content);
            info.setFontCheckSum(response.getFontChecksum());
            info.setFontFormatVersion(response.getFontFormatVersion());
            info.setNameEn(response.getNameEn());
            info.setBytesTtf(response.getBytesTtf().toByteArray());
            info.setBytesEot(response.getBytesEot().toByteArray());
            info.setBytesWoff(response.getBytesWoff().toByteArray());
			info.setBytesWoff2(response.getBytesWoff2().toByteArray());
            logger.log(Level.INFO, "success build font:{0}", response.getFontId());
            logger.log(Level.INFO, "ttf len:{0}", response.getBytesTtf().size());
            logger.log(Level.INFO, "eot len:{0}", response.getBytesEot().size());
            logger.log(Level.INFO, "woff len:{0}", response.getBytesWoff().size());
			logger.log(Level.INFO, "woff2 len:{0}", response.getBytesWoff2().size());
            logger.log(Level.INFO, "name:{0}", response.getNameEn());
            return info;
        } catch (StatusRuntimeException e) {
            logger.log(
                    Level.WARNING,
                    "RPC failed: {0}  Desc: {1}",
                    new Object[]{e.getStatus().getCode().value(), e.getStatus().getDescription()});
            throw e;
        }
    }

    public List<WebFontInfo> multbuild(String apiKey, int[] fontIds, String content) {
        MultFontBuildRequest.Builder builder = MultFontBuildRequest.newBuilder();
        for (int fontId : fontIds) {
            builder.addItems(
                    FontBuildRequest.newBuilder()
                            .setApikey(apiKey)
                            .setFontId(fontId)
                            .setText(content)
                            .setNeedTtf(true)
                            .setNeedEot(true)
                            .setNeedWoff(true));
        }
        MultFontBuildRequest request = builder.build();

        MultFontBuildBufResult response;
        try {
            response = blockingStub.multBuildFont(request);
            List<WebFontInfo> result = new ArrayList<WebFontInfo>();
            for (FontBuildBufResult item : response.getItemsList()) {
                WebFontInfo info = new WebFontInfo();
                info.setFontId(item.getFontId());
                info.setContent(content);
                info.setApiKey(apiKey);
                info.setFontCheckSum(item.getFontChecksum());
                info.setFontFormatVersion(item.getFontFormatVersion());
                info.setNameEn(item.getNameEn());
                info.setBytesTtf(item.getBytesTtf().toByteArray());
                info.setBytesEot(item.getBytesEot().toByteArray());
                info.setBytesWoff(item.getBytesWoff().toByteArray());
                result.add(info);
                logger.log(Level.INFO, "success build font:{0}", item.getFontId());
                logger.log(Level.INFO, "ttf len:{0}", item.getBytesTtf().size());
                logger.log(Level.INFO, "eot len:{0}", item.getBytesEot().size());
                logger.log(Level.INFO, "woff len:{0}", item.getBytesWoff().size());
            }
            return result;
        } catch (StatusRuntimeException e) {
            logger.log(
                    Level.WARNING,
                    "RPC failed: {0}  Desc: {1}",
                    new Object[]{e.getStatus().getCode().value(), e.getStatus().getDescription()});
            return null;
        }
    }

    /**
     * 将生成的webfont资源上传到存储空间里，并返回保存的地址，用于构建@font-face语句。
     *
     * @param webFontInfo
     * @param url         自定义保存路径
     * @return
     */
    public FontFaceInfo uploadFontFile(WebFontInfo webFontInfo, String url) {
        // 类似：a/b/font1
        String objectBaseName = "";
        if (StringUtils.isNullOrEmpty(url)) {
            // 使用fontid+ randomid
            objectBaseName =
                    "fontface/"
                            + webFontInfo.getFontId()
                            + "/"
                            + UUID.randomUUID().toString().replace("-", "")
                            + "/"
                            + webFontInfo.getNameEn();
        } else {
            objectBaseName = url;
        }
        System.out.println("objectBaseName:" + objectBaseName);

        String eotObjectName = objectBaseName + ".eot";
        String woffObjectName = objectBaseName + ".woff";
		String woff2ObjectName = objectBaseName + ".woff2";
        String ttfObjectName = objectBaseName + ".ttf";
        String eotUrlString = webFontInfo.getBytesEot().length != 0 ? uploadOss(webFontInfo.getBytesEot(), eotObjectName) : "";
        String woffUrlString = webFontInfo.getBytesWoff().length != 0 ? uploadOss(webFontInfo.getBytesWoff(), woffObjectName) : "";
		String woff2UrlString = webFontInfo.getBytesWoff2().length != 0 ? uploadOss(webFontInfo.getBytesWoff2(), woff2ObjectName) : "";
        String ttfUrlString = webFontInfo.getBytesTtf().length != 0 ? uploadOss(webFontInfo.getBytesTtf(), ttfObjectName) : "";

        FontFaceInfo fontfaceinfo = new FontFaceInfo();
        fontfaceinfo.setEotUrl(eotUrlString);
        fontfaceinfo.setWoffUrl(woffUrlString);
		fontfaceinfo.setWoff2Url(woff2UrlString);
        fontfaceinfo.setTtfUrl(ttfUrlString);
        fontfaceinfo.setNameEn(webFontInfo.getNameEn());
        return fontfaceinfo;
    }

    /**
     * 将文件上传存储空间的方法（本SDK是用阿里云OSS作为存储空间）。
     * 用户可以根据自身的情况重写该方法，重写时须注意该方法必须传入文件二进制流（byte[]）和文件名
     *
     * @param fontfile   文件二进制流
     * @param objectName 文件名
     * @return 返回文件的完整存储地址（SDK将使用该地址构建@font-face语句）。
     */
    public String uploadOss(byte[] fontfile, String objectName) {
        // Endpoint以北京为例，其它Region请按实际情况填写。
        String endpoint = "oss-cn-beijing.aliyuncs.com";

        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录
        // https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "<yourAccessKeyId>";
        String accessKeySecret = "<yourAccessKeySecret>";
        String bucketName = "<yourBucketName>";


        // 创建OSSClient实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        try {
            boolean exists = ossClient.doesBucketExist(bucketName);
            if (exists) {
                // 设置存储空间的访问权限为公共读。
                ossClient.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);
                // 上传内容到指定的存储空间（bucketName）并保存为指定的文件名称（objectName）。
                ossClient.putObject(
                        bucketName, objectName, new ByteArrayInputStream(fontfile));
                // 设置URL过期时间
                Date expiration = new Date(new Date().getTime() + 3600 * 1000 * 24 * 1000);
                // 生成以GET方法访问的签名URL，访客可以直接通过浏览器访问相关内容。
                URL fontfileUrl = ossClient.generatePresignedUrl(bucketName, objectName, expiration);
                String fontfileString = fontfileUrl.toString().substring(0, fontfileUrl.toString().indexOf("?"));
                System.out.println("fontfileString: " + fontfileString);
                return fontfileString;
            }
            throw new OSSException("bucket [" + bucketName + "] is not exist!");
        } catch (OSSException oe) {
            System.out.println(
                    "Caught an OSSException, which means your request made it to OSS, "
                            + "but was rejected with an error response for some reason.");
            System.out.println("Error Message: " + oe.getErrorMessage());
            System.out.println("Error Code:       " + oe.getErrorCode());
            System.out.println("Request ID:      " + oe.getRequestId());
            System.out.println("Host ID:           " + oe.getHostId());
            throw oe;
        } catch (ClientException ce) {
            System.out.println(
                    "Caught an ClientException, which means the client encountered "
                            + "a serious internal problem while trying to communicate with OSS, "
                            + "such as not being able to access the network.");
            ce.printStackTrace();
            throw ce;
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
    }

    /**
     * 根据webfont资源保存的地址来生成@font-face语句。
     *
     * @param fontFaceInfo
     * @return
     */
    public WebFontFace buildWebFontFace(FontFaceInfo fontFaceInfo) {
        WebFontFace webFontFace = new WebFontFace();
        //定义生成的@font-face语句里的font-family属性值，本SDK默认将字体的英文名字作为@font-face语句里的font-family属性值。
        webFontFace.setFontFamily(fontFaceInfo.getNameEn());

        System.out.println(fontFaceInfo.toString());

        String fontface =
                "@font-face{font-family:'"
                        + fontFaceInfo.getNameEn()
                        + "';";


        //如果eot不为空
        if (!StringUtils.isNullOrEmpty(fontFaceInfo.getEotUrl())) {
            fontface += "src:url('" + fontFaceInfo.getEotUrl() + "');";
        }

        fontface += "src:";

        //如果eot不为空
        if (!StringUtils.isNullOrEmpty(fontFaceInfo.getEotUrl())) {
            fontface += "url('" + fontFaceInfo.getEotUrl() + "?#iefix')format('embedded-opentype'),";

        }

		 //如果woff2不为空
        if (!StringUtils.isNullOrEmpty(fontFaceInfo.getWoff2Url())) {
            fontface += "url('" + fontFaceInfo.getWoff2Url() + "')format('woff2'),";
        }


        //如果woff不为空
        if (!StringUtils.isNullOrEmpty(fontFaceInfo.getWoffUrl())) {
            fontface += "url('" + fontFaceInfo.getWoffUrl() + "')format('woff'),";
        }

        //如果ttf不为空
        if (!StringUtils.isNullOrEmpty(fontFaceInfo.getTtfUrl())) {
            fontface += "url('" + fontFaceInfo.getTtfUrl() + "')format('truetype'),";
        }

        fontface = fontface.substring(0, fontface.length() - 1);
        fontface += ";}";

        if (!StringUtils.isNullOrEmpty(fontFaceInfo.getTag())) {
            fontface += fontFaceInfo.getTag() + "{font-family:'"
                    + fontFaceInfo.getNameEn()
                    + "'}";
        }
        System.out.println(fontface);
        webFontFace.setFontFace(fontface);
        webFontFace.setTag(fontFaceInfo.getTag());
        webFontFace.setWoff(fontFaceInfo.getWoffUrl());
        return webFontFace;
    }

    /**
     * 用户在程序中调用该方法，服务器生成webfont并返回@font-face语句
     *
     * @param param
     * @return
     */
    public WebFontFace getFontFace(FontFaceParam param) {
        // 传入用户可使用的字体id和需要处理的文本，然后进行构建字体库
        WebFontInfo webfontinfo = buildfont(apiKey, param.getAccessKey(), param.getContent());
        // 将生成的webfont资源上传到存储空间里，并返回保存的地址，用于构建@font-face语句。
        FontFaceInfo fontFaceInfo = uploadFontFile(webfontinfo, param.getUrl());
        // 设置Tag参数，Tag即是select代码，如果调用getFontFace()方法时填写此参数，则返回的@font-face语句会自动将效果引用至select上。
        fontFaceInfo.setTag(param.getTag());
        // 根据webfont资源保存的地址来生成@font-face语句。
        cn.webfont.client.model.WebFontFace webfontface =
                buildWebFontFace(fontFaceInfo);
        return webfontface;
    }
}
