<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: webfont.proto

namespace Webfontsdk;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>webfontsdk.GetFontListRequest</code>
 */
class GetFontListRequest extends \Google\Protobuf\Internal\Message
{
    /**
     *通过厂商来搜索   ，0则忽略此项
     *
     * Generated from protobuf field <code>uint32 maker_id = 1;</code>
     */
    private $maker_id = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $maker_id
     *          通过厂商来搜索   ，0则忽略此项
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Webfont::initOnce();
        parent::__construct($data);
    }

    /**
     *通过厂商来搜索   ，0则忽略此项
     *
     * Generated from protobuf field <code>uint32 maker_id = 1;</code>
     * @return int
     */
    public function getMakerId()
    {
        return $this->maker_id;
    }

    /**
     *通过厂商来搜索   ，0则忽略此项
     *
     * Generated from protobuf field <code>uint32 maker_id = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setMakerId($var)
    {
        GPBUtil::checkUint32($var);
        $this->maker_id = $var;

        return $this;
    }

}

