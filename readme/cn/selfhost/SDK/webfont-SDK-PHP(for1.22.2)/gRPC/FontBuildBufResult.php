<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: webfont.proto

namespace Webfontsdk;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>webfontsdk.FontBuildBufResult</code>
 */
class FontBuildBufResult extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint32 font_id = 1;</code>
     */
    private $font_id = 0;
    /**
     *字体格式版本
     *
     * Generated from protobuf field <code>uint32 font_format_version = 2;</code>
     */
    private $font_format_version = 0;
    /**
     *字体的唯一辨识编码
     *
     * Generated from protobuf field <code>uint64 font_checksum = 3;</code>
     */
    private $font_checksum = 0;
    /**
     * Generated from protobuf field <code>string name_en = 4;</code>
     */
    private $name_en = '';
    /**
     * Generated from protobuf field <code>bytes bytes_ttf = 5;</code>
     */
    private $bytes_ttf = '';
    /**
     * Generated from protobuf field <code>bytes bytes_eot = 6;</code>
     */
    private $bytes_eot = '';
    /**
     * Generated from protobuf field <code>bytes bytes_woff = 7;</code>
     */
    private $bytes_woff = '';
    /**
     * Generated from protobuf field <code>bytes bytes_woff2 = 8;</code>
     */
    private $bytes_woff2 = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $font_id
     *     @type int $font_format_version
     *          字体格式版本
     *     @type int|string $font_checksum
     *          字体的唯一辨识编码
     *     @type string $name_en
     *     @type string $bytes_ttf
     *     @type string $bytes_eot
     *     @type string $bytes_woff
     *     @type string $bytes_woff2
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
     *字体格式版本
     *
     * Generated from protobuf field <code>uint32 font_format_version = 2;</code>
     * @return int
     */
    public function getFontFormatVersion()
    {
        return $this->font_format_version;
    }

    /**
     *字体格式版本
     *
     * Generated from protobuf field <code>uint32 font_format_version = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setFontFormatVersion($var)
    {
        GPBUtil::checkUint32($var);
        $this->font_format_version = $var;

        return $this;
    }

    /**
     *字体的唯一辨识编码
     *
     * Generated from protobuf field <code>uint64 font_checksum = 3;</code>
     * @return int|string
     */
    public function getFontChecksum()
    {
        return $this->font_checksum;
    }

    /**
     *字体的唯一辨识编码
     *
     * Generated from protobuf field <code>uint64 font_checksum = 3;</code>
     * @param int|string $var
     * @return $this
     */
    public function setFontChecksum($var)
    {
        GPBUtil::checkUint64($var);
        $this->font_checksum = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string name_en = 4;</code>
     * @return string
     */
    public function getNameEn()
    {
        return $this->name_en;
    }

    /**
     * Generated from protobuf field <code>string name_en = 4;</code>
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
     * Generated from protobuf field <code>bytes bytes_ttf = 5;</code>
     * @return string
     */
    public function getBytesTtf()
    {
        return $this->bytes_ttf;
    }

    /**
     * Generated from protobuf field <code>bytes bytes_ttf = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setBytesTtf($var)
    {
        GPBUtil::checkString($var, False);
        $this->bytes_ttf = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes bytes_eot = 6;</code>
     * @return string
     */
    public function getBytesEot()
    {
        return $this->bytes_eot;
    }

    /**
     * Generated from protobuf field <code>bytes bytes_eot = 6;</code>
     * @param string $var
     * @return $this
     */
    public function setBytesEot($var)
    {
        GPBUtil::checkString($var, False);
        $this->bytes_eot = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes bytes_woff = 7;</code>
     * @return string
     */
    public function getBytesWoff()
    {
        return $this->bytes_woff;
    }

    /**
     * Generated from protobuf field <code>bytes bytes_woff = 7;</code>
     * @param string $var
     * @return $this
     */
    public function setBytesWoff($var)
    {
        GPBUtil::checkString($var, False);
        $this->bytes_woff = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bytes bytes_woff2 = 8;</code>
     * @return string
     */
    public function getBytesWoff2()
    {
        return $this->bytes_woff2;
    }

    /**
     * Generated from protobuf field <code>bytes bytes_woff2 = 8;</code>
     * @param string $var
     * @return $this
     */
    public function setBytesWoff2($var)
    {
        GPBUtil::checkString($var, False);
        $this->bytes_woff2 = $var;

        return $this;
    }

}

