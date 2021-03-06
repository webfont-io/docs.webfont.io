<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: webfont.proto

namespace Webfontsdk;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>webfontsdk.FontBuildAccessKeyRequest</code>
 */
class FontBuildAccessKeyRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string apikey = 1;</code>
     */
    private $apikey = '';
    /**
     * Generated from protobuf field <code>string accesskey = 2;</code>
     */
    private $accesskey = '';
    /**
     * Generated from protobuf field <code>string text = 3;</code>
     */
    private $text = '';
    /**
     * Generated from protobuf field <code>bool need_ttf = 4;</code>
     */
    private $need_ttf = false;
    /**
     * Generated from protobuf field <code>bool need_eot = 5;</code>
     */
    private $need_eot = false;
    /**
     * Generated from protobuf field <code>bool need_woff = 6;</code>
     */
    private $need_woff = false;
    /**
     * Generated from protobuf field <code>bool need_woff2 = 7;</code>
     */
    private $need_woff2 = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $apikey
     *     @type string $accesskey
     *     @type string $text
     *     @type bool $need_ttf
     *     @type bool $need_eot
     *     @type bool $need_woff
     *     @type bool $need_woff2
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Webfont::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string apikey = 1;</code>
     * @return string
     */
    public function getApikey()
    {
        return $this->apikey;
    }

    /**
     * Generated from protobuf field <code>string apikey = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setApikey($var)
    {
        GPBUtil::checkString($var, True);
        $this->apikey = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string accesskey = 2;</code>
     * @return string
     */
    public function getAccesskey()
    {
        return $this->accesskey;
    }

    /**
     * Generated from protobuf field <code>string accesskey = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setAccesskey($var)
    {
        GPBUtil::checkString($var, True);
        $this->accesskey = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string text = 3;</code>
     * @return string
     */
    public function getText()
    {
        return $this->text;
    }

    /**
     * Generated from protobuf field <code>string text = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setText($var)
    {
        GPBUtil::checkString($var, True);
        $this->text = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool need_ttf = 4;</code>
     * @return bool
     */
    public function getNeedTtf()
    {
        return $this->need_ttf;
    }

    /**
     * Generated from protobuf field <code>bool need_ttf = 4;</code>
     * @param bool $var
     * @return $this
     */
    public function setNeedTtf($var)
    {
        GPBUtil::checkBool($var);
        $this->need_ttf = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool need_eot = 5;</code>
     * @return bool
     */
    public function getNeedEot()
    {
        return $this->need_eot;
    }

    /**
     * Generated from protobuf field <code>bool need_eot = 5;</code>
     * @param bool $var
     * @return $this
     */
    public function setNeedEot($var)
    {
        GPBUtil::checkBool($var);
        $this->need_eot = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool need_woff = 6;</code>
     * @return bool
     */
    public function getNeedWoff()
    {
        return $this->need_woff;
    }

    /**
     * Generated from protobuf field <code>bool need_woff = 6;</code>
     * @param bool $var
     * @return $this
     */
    public function setNeedWoff($var)
    {
        GPBUtil::checkBool($var);
        $this->need_woff = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool need_woff2 = 7;</code>
     * @return bool
     */
    public function getNeedWoff2()
    {
        return $this->need_woff2;
    }

    /**
     * Generated from protobuf field <code>bool need_woff2 = 7;</code>
     * @param bool $var
     * @return $this
     */
    public function setNeedWoff2($var)
    {
        GPBUtil::checkBool($var);
        $this->need_woff2 = $var;

        return $this;
    }

}

