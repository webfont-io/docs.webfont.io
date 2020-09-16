<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: webfont.proto

namespace Webfontsdk;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>webfontsdk.GetProfileWithoutMapResult</code>
 */
class GetProfileWithoutMapResult extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint32 font_id = 1;</code>
     */
    private $font_id = 0;
    /**
     * Generated from protobuf field <code>bytes data = 2;</code>
     */
    private $data = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $font_id
     *     @type string $data
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Webfont::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>uint32 font_id = 1;</code>
     * @return int
     */
    public function getFontId()
    {
        return $this->font_id;
    }

    /**
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
     * Generated from protobuf field <code>bytes data = 2;</code>
     * @return string
     */
    public function getData()
    {
        return $this->data;
    }

    /**
     * Generated from protobuf field <code>bytes data = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setData($var)
    {
        GPBUtil::checkString($var, False);
        $this->data = $var;

        return $this;
    }

}

