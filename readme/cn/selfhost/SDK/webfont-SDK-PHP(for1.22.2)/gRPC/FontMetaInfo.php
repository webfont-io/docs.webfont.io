<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: webfont.proto

namespace Webfontsdk;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 *字体信息
 *
 * Generated from protobuf message <code>webfontsdk.FontMetaInfo</code>
 */
class FontMetaInfo extends \Google\Protobuf\Internal\Message
{
    /**
     *字体id
     *
     * Generated from protobuf field <code>uint32 font_id = 1;</code>
     */
    private $font_id = 0;
    /**
     *厂商编号
     *
     * Generated from protobuf field <code>uint32 maker_id = 2;</code>
     */
    private $maker_id = 0;
    /**
     *字体英文名
     *
     * Generated from protobuf field <code>string name_en = 3;</code>
     */
    private $name_en = '';
    /**
     *字体中文名
     *
     * Generated from protobuf field <code>string name_cn = 4;</code>
     */
    private $name_cn = '';
    /**
     *字体繁体名
     *
     * Generated from protobuf field <code>string name_tw = 5;</code>
     */
    private $name_tw = '';
    /**
     *字体日文名
     *
     * Generated from protobuf field <code>string name_jp = 6;</code>
     */
    private $name_jp = '';
    /**
     *字体韩语名
     *
     * Generated from protobuf field <code>string name_kr = 7;</code>
     */
    private $name_kr = '';
    /**
     *英语介绍
     *
     * Generated from protobuf field <code>string intro_en = 8;</code>
     */
    private $intro_en = '';
    /**
     *中文介绍
     *
     * Generated from protobuf field <code>string intro_cn = 9;</code>
     */
    private $intro_cn = '';
    /**
     *繁体中文介绍
     *
     * Generated from protobuf field <code>string intro_tw = 10;</code>
     */
    private $intro_tw = '';
    /**
     *日语介绍
     *
     * Generated from protobuf field <code>string intro_jp = 11;</code>
     */
    private $intro_jp = '';
    /**
     *韩语介绍
     *
     * Generated from protobuf field <code>string intro_kr = 12;</code>
     */
    private $intro_kr = '';
    /**
     *语系列表
     *
     * Generated from protobuf field <code>repeated .webfontsdk.Language lang = 13;</code>
     */
    private $lang;
    /**
     *版权授权价格：0代表免费，-1代表不允许按月购买
     *
     * Generated from protobuf field <code>int32 cr_price_month = 14;</code>
     */
    private $cr_price_month = 0;
    /**
     *版权按年价格：0代表免费，-1代表不允许按年购买，都为-1则无法提供在线购买方式，
     *
     * Generated from protobuf field <code>int32 cr_price_year = 15;</code>
     */
    private $cr_price_year = 0;
    /**
     *CSS文件下载价格,按次收费。298元左右,-1代表不允许下载css，0代表免费
     *
     * Generated from protobuf field <code>int32 cr_price_cssdownload = 16;</code>
     */
    private $cr_price_cssdownload = 0;
    /**
     *是否免cdn流量费
     *
     * Generated from protobuf field <code>bool cdn_free = 17;</code>
     */
    private $cdn_free = false;
    /**
     *是否可以在厂商官网购买
     *
     * Generated from protobuf field <code>bool cr_buy_on_makersite = 18;</code>
     */
    private $cr_buy_on_makersite = false;
    /**
     *当前字体在厂商的网址，如果为 "" 则自动使用厂商网址填充
     *
     * Generated from protobuf field <code>string cr_url_on_makersite = 19;</code>
     */
    private $cr_url_on_makersite = '';
    /**
     *通过在线购买的月服务费  0代表免费
     *
     * Generated from protobuf field <code>uint32 service_fee_of_online_month = 20;</code>
     */
    private $service_fee_of_online_month = 0;
    /**
     *通过在线购买的年服务费   0代表免费
     *
     * Generated from protobuf field <code>uint32 service_fee_of_online_year = 21;</code>
     */
    private $service_fee_of_online_year = 0;
    /**
     *通过上传授权书购买的月服务费   -1代表不允许上传授权书  0代表免费
     *
     * Generated from protobuf field <code>int32 service_fee_of_attorney_month = 22;</code>
     */
    private $service_fee_of_attorney_month = 0;
    /**
     *通过上传授权书购买的年服务费    -1代表不允许上传授权书  0代表免费
     *
     * Generated from protobuf field <code>int32 service_fee_of_attorney_year = 23;</code>
     */
    private $service_fee_of_attorney_year = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $font_id
     *          字体id
     *     @type int $maker_id
     *          厂商编号
     *     @type string $name_en
     *          字体英文名
     *     @type string $name_cn
     *          字体中文名
     *     @type string $name_tw
     *          字体繁体名
     *     @type string $name_jp
     *          字体日文名
     *     @type string $name_kr
     *          字体韩语名
     *     @type string $intro_en
     *          英语介绍
     *     @type string $intro_cn
     *          中文介绍
     *     @type string $intro_tw
     *          繁体中文介绍
     *     @type string $intro_jp
     *          日语介绍
     *     @type string $intro_kr
     *          韩语介绍
     *     @type int[]|\Google\Protobuf\Internal\RepeatedField $lang
     *          语系列表
     *     @type int $cr_price_month
     *          版权授权价格：0代表免费，-1代表不允许按月购买
     *     @type int $cr_price_year
     *          版权按年价格：0代表免费，-1代表不允许按年购买，都为-1则无法提供在线购买方式，
     *     @type int $cr_price_cssdownload
     *          CSS文件下载价格,按次收费。298元左右,-1代表不允许下载css，0代表免费
     *     @type bool $cdn_free
     *          是否免cdn流量费
     *     @type bool $cr_buy_on_makersite
     *          是否可以在厂商官网购买
     *     @type string $cr_url_on_makersite
     *          当前字体在厂商的网址，如果为 "" 则自动使用厂商网址填充
     *     @type int $service_fee_of_online_month
     *          通过在线购买的月服务费  0代表免费
     *     @type int $service_fee_of_online_year
     *          通过在线购买的年服务费   0代表免费
     *     @type int $service_fee_of_attorney_month
     *          通过上传授权书购买的月服务费   -1代表不允许上传授权书  0代表免费
     *     @type int $service_fee_of_attorney_year
     *          通过上传授权书购买的年服务费    -1代表不允许上传授权书  0代表免费
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Webfont::initOnce();
        parent::__construct($data);
    }

    /**
     *字体id
     *
     * Generated from protobuf field <code>uint32 font_id = 1;</code>
     * @return int
     */
    public function getFontId()
    {
        return $this->font_id;
    }

    /**
     *字体id
     *
     * Generated from protobuf field <code>uint32 font_id = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setFontId($var)
    {
        GPBUtil::checkUint32($var);
        $this->font_id = $var;

        return $this;
    }

    /**
     *厂商编号
     *
     * Generated from protobuf field <code>uint32 maker_id = 2;</code>
     * @return int
     */
    public function getMakerId()
    {
        return $this->maker_id;
    }

    /**
     *厂商编号
     *
     * Generated from protobuf field <code>uint32 maker_id = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setMakerId($var)
    {
        GPBUtil::checkUint32($var);
        $this->maker_id = $var;

        return $this;
    }

    /**
     *字体英文名
     *
     * Generated from protobuf field <code>string name_en = 3;</code>
     * @return string
     */
    public function getNameEn()
    {
        return $this->name_en;
    }

    /**
     *字体英文名
     *
     * Generated from protobuf field <code>string name_en = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setNameEn($var)
    {
        GPBUtil::checkString($var, True);
        $this->name_en = $var;

        return $this;
    }

    /**
     *字体中文名
     *
     * Generated from protobuf field <code>string name_cn = 4;</code>
     * @return string
     */
    public function getNameCn()
    {
        return $this->name_cn;
    }

    /**
     *字体中文名
     *
     * Generated from protobuf field <code>string name_cn = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setNameCn($var)
    {
        GPBUtil::checkString($var, True);
        $this->name_cn = $var;

        return $this;
    }

    /**
     *字体繁体名
     *
     * Generated from protobuf field <code>string name_tw = 5;</code>
     * @return string
     */
    public function getNameTw()
    {
        return $this->name_tw;
    }

    /**
     *字体繁体名
     *
     * Generated from protobuf field <code>string name_tw = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setNameTw($var)
    {
        GPBUtil::checkString($var, True);
        $this->name_tw = $var;

        return $this;
    }

    /**
     *字体日文名
     *
     * Generated from protobuf field <code>string name_jp = 6;</code>
     * @return string
     */
    public function getNameJp()
    {
        return $this->name_jp;
    }

    /**
     *字体日文名
     *
     * Generated from protobuf field <code>string name_jp = 6;</code>
     * @param string $var
     * @return $this
     */
    public function setNameJp($var)
    {
        GPBUtil::checkString($var, True);
        $this->name_jp = $var;

        return $this;
    }

    /**
     *字体韩语名
     *
     * Generated from protobuf field <code>string name_kr = 7;</code>
     * @return string
     */
    public function getNameKr()
    {
        return $this->name_kr;
    }

    /**
     *字体韩语名
     *
     * Generated from protobuf field <code>string name_kr = 7;</code>
     * @param string $var
     * @return $this
     */
    public function setNameKr($var)
    {
        GPBUtil::checkString($var, True);
        $this->name_kr = $var;

        return $this;
    }

    /**
     *英语介绍
     *
     * Generated from protobuf field <code>string intro_en = 8;</code>
     * @return string
     */
    public function getIntroEn()
    {
        return $this->intro_en;
    }

    /**
     *英语介绍
     *
     * Generated from protobuf field <code>string intro_en = 8;</code>
     * @param string $var
     * @return $this
     */
    public function setIntroEn($var)
    {
        GPBUtil::checkString($var, True);
        $this->intro_en = $var;

        return $this;
    }

    /**
     *中文介绍
     *
     * Generated from protobuf field <code>string intro_cn = 9;</code>
     * @return string
     */
    public function getIntroCn()
    {
        return $this->intro_cn;
    }

    /**
     *中文介绍
     *
     * Generated from protobuf field <code>string intro_cn = 9;</code>
     * @param string $var
     * @return $this
     */
    public function setIntroCn($var)
    {
        GPBUtil::checkString($var, True);
        $this->intro_cn = $var;

        return $this;
    }

    /**
     *繁体中文介绍
     *
     * Generated from protobuf field <code>string intro_tw = 10;</code>
     * @return string
     */
    public function getIntroTw()
    {
        return $this->intro_tw;
    }

    /**
     *繁体中文介绍
     *
     * Generated from protobuf field <code>string intro_tw = 10;</code>
     * @param string $var
     * @return $this
     */
    public function setIntroTw($var)
    {
        GPBUtil::checkString($var, True);
        $this->intro_tw = $var;

        return $this;
    }

    /**
     *日语介绍
     *
     * Generated from protobuf field <code>string intro_jp = 11;</code>
     * @return string
     */
    public function getIntroJp()
    {
        return $this->intro_jp;
    }

    /**
     *日语介绍
     *
     * Generated from protobuf field <code>string intro_jp = 11;</code>
     * @param string $var
     * @return $this
     */
    public function setIntroJp($var)
    {
        GPBUtil::checkString($var, True);
        $this->intro_jp = $var;

        return $this;
    }

    /**
     *韩语介绍
     *
     * Generated from protobuf field <code>string intro_kr = 12;</code>
     * @return string
     */
    public function getIntroKr()
    {
        return $this->intro_kr;
    }

    /**
     *韩语介绍
     *
     * Generated from protobuf field <code>string intro_kr = 12;</code>
     * @param string $var
     * @return $this
     */
    public function setIntroKr($var)
    {
        GPBUtil::checkString($var, True);
        $this->intro_kr = $var;

        return $this;
    }

    /**
     *语系列表
     *
     * Generated from protobuf field <code>repeated .webfontsdk.Language lang = 13;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getLang()
    {
        return $this->lang;
    }

    /**
     *语系列表
     *
     * Generated from protobuf field <code>repeated .webfontsdk.Language lang = 13;</code>
     * @param int[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setLang($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::ENUM, \gRPC\Language::class);
        $this->lang = $arr;

        return $this;
    }

    /**
     *版权授权价格：0代表免费，-1代表不允许按月购买
     *
     * Generated from protobuf field <code>int32 cr_price_month = 14;</code>
     * @return int
     */
    public function getCrPriceMonth()
    {
        return $this->cr_price_month;
    }

    /**
     *版权授权价格：0代表免费，-1代表不允许按月购买
     *
     * Generated from protobuf field <code>int32 cr_price_month = 14;</code>
     * @param int $var
     * @return $this
     */
    public function setCrPriceMonth($var)
    {
        GPBUtil::checkInt32($var);
        $this->cr_price_month = $var;

        return $this;
    }

    /**
     *版权按年价格：0代表免费，-1代表不允许按年购买，都为-1则无法提供在线购买方式，
     *
     * Generated from protobuf field <code>int32 cr_price_year = 15;</code>
     * @return int
     */
    public function getCrPriceYear()
    {
        return $this->cr_price_year;
    }

    /**
     *版权按年价格：0代表免费，-1代表不允许按年购买，都为-1则无法提供在线购买方式，
     *
     * Generated from protobuf field <code>int32 cr_price_year = 15;</code>
     * @param int $var
     * @return $this
     */
    public function setCrPriceYear($var)
    {
        GPBUtil::checkInt32($var);
        $this->cr_price_year = $var;

        return $this;
    }

    /**
     *CSS文件下载价格,按次收费。298元左右,-1代表不允许下载css，0代表免费
     *
     * Generated from protobuf field <code>int32 cr_price_cssdownload = 16;</code>
     * @return int
     */
    public function getCrPriceCssdownload()
    {
        return $this->cr_price_cssdownload;
    }

    /**
     *CSS文件下载价格,按次收费。298元左右,-1代表不允许下载css，0代表免费
     *
     * Generated from protobuf field <code>int32 cr_price_cssdownload = 16;</code>
     * @param int $var
     * @return $this
     */
    public function setCrPriceCssdownload($var)
    {
        GPBUtil::checkInt32($var);
        $this->cr_price_cssdownload = $var;

        return $this;
    }

    /**
     *是否免cdn流量费
     *
     * Generated from protobuf field <code>bool cdn_free = 17;</code>
     * @return bool
     */
    public function getCdnFree()
    {
        return $this->cdn_free;
    }

    /**
     *是否免cdn流量费
     *
     * Generated from protobuf field <code>bool cdn_free = 17;</code>
     * @param bool $var
     * @return $this
     */
    public function setCdnFree($var)
    {
        GPBUtil::checkBool($var);
        $this->cdn_free = $var;

        return $this;
    }

    /**
     *是否可以在厂商官网购买
     *
     * Generated from protobuf field <code>bool cr_buy_on_makersite = 18;</code>
     * @return bool
     */
    public function getCrBuyOnMakersite()
    {
        return $this->cr_buy_on_makersite;
    }

    /**
     *是否可以在厂商官网购买
     *
     * Generated from protobuf field <code>bool cr_buy_on_makersite = 18;</code>
     * @param bool $var
     * @return $this
     */
    public function setCrBuyOnMakersite($var)
    {
        GPBUtil::checkBool($var);
        $this->cr_buy_on_makersite = $var;

        return $this;
    }

    /**
     *当前字体在厂商的网址，如果为 "" 则自动使用厂商网址填充
     *
     * Generated from protobuf field <code>string cr_url_on_makersite = 19;</code>
     * @return string
     */
    public function getCrUrlOnMakersite()
    {
        return $this->cr_url_on_makersite;
    }

    /**
     *当前字体在厂商的网址，如果为 "" 则自动使用厂商网址填充
     *
     * Generated from protobuf field <code>string cr_url_on_makersite = 19;</code>
     * @param string $var
     * @return $this
     */
    public function setCrUrlOnMakersite($var)
    {
        GPBUtil::checkString($var, True);
        $this->cr_url_on_makersite = $var;

        return $this;
    }

    /**
     *通过在线购买的月服务费  0代表免费
     *
     * Generated from protobuf field <code>uint32 service_fee_of_online_month = 20;</code>
     * @return int
     */
    public function getServiceFeeOfOnlineMonth()
    {
        return $this->service_fee_of_online_month;
    }

    /**
     *通过在线购买的月服务费  0代表免费
     *
     * Generated from protobuf field <code>uint32 service_fee_of_online_month = 20;</code>
     * @param int $var
     * @return $this
     */
    public function setServiceFeeOfOnlineMonth($var)
    {
        GPBUtil::checkUint32($var);
        $this->service_fee_of_online_month = $var;

        return $this;
    }

    /**
     *通过在线购买的年服务费   0代表免费
     *
     * Generated from protobuf field <code>uint32 service_fee_of_online_year = 21;</code>
     * @return int
     */
    public function getServiceFeeOfOnlineYear()
    {
        return $this->service_fee_of_online_year;
    }

    /**
     *通过在线购买的年服务费   0代表免费
     *
     * Generated from protobuf field <code>uint32 service_fee_of_online_year = 21;</code>
     * @param int $var
     * @return $this
     */
    public function setServiceFeeOfOnlineYear($var)
    {
        GPBUtil::checkUint32($var);
        $this->service_fee_of_online_year = $var;

        return $this;
    }

    /**
     *通过上传授权书购买的月服务费   -1代表不允许上传授权书  0代表免费
     *
     * Generated from protobuf field <code>int32 service_fee_of_attorney_month = 22;</code>
     * @return int
     */
    public function getServiceFeeOfAttorneyMonth()
    {
        return $this->service_fee_of_attorney_month;
    }

    /**
     *通过上传授权书购买的月服务费   -1代表不允许上传授权书  0代表免费
     *
     * Generated from protobuf field <code>int32 service_fee_of_attorney_month = 22;</code>
     * @param int $var
     * @return $this
     */
    public function setServiceFeeOfAttorneyMonth($var)
    {
        GPBUtil::checkInt32($var);
        $this->service_fee_of_attorney_month = $var;

        return $this;
    }

    /**
     *通过上传授权书购买的年服务费    -1代表不允许上传授权书  0代表免费
     *
     * Generated from protobuf field <code>int32 service_fee_of_attorney_year = 23;</code>
     * @return int
     */
    public function getServiceFeeOfAttorneyYear()
    {
        return $this->service_fee_of_attorney_year;
    }

    /**
     *通过上传授权书购买的年服务费    -1代表不允许上传授权书  0代表免费
     *
     * Generated from protobuf field <code>int32 service_fee_of_attorney_year = 23;</code>
     * @param int $var
     * @return $this
     */
    public function setServiceFeeOfAttorneyYear($var)
    {
        GPBUtil::checkInt32($var);
        $this->service_fee_of_attorney_year = $var;

        return $this;
    }

}

