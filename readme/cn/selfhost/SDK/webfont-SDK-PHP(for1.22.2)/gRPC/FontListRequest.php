<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: webfont.proto

namespace Webfontsdk;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>webfontsdk.FontListRequest</code>
 */
class FontListRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string apikey = 1;</code>
     */
    private $apikey = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $apikey
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

}
