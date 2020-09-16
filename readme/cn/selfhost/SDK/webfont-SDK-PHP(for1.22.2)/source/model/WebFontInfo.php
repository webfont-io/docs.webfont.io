<?php
/**
 * Created by PhpStorm.
 * User: niyonghang
 * Date: 2020/2/27
 * Time: 3:21 PM
 */

namespace source\model;


class WebFontInfo
{
    private $fontId;
    private $fontFormatVersion;
    private $fontCheckSum;
    private $date;
    private $nameEn;

    private $bytesTtf;
    private $bytesEot;
    private $bytesWoff;
	private $bytesWoff2;
    private $content;
    private $apiKey;

    private $ttfUrl;
    private $woffUrl;
	private $woff2Url;
    private $eotUrl;

    /**
     * WebFontInfo constructor.
     */
    public function __construct()
    {
    }


    /**
     * @return mixed
     */
    public function getFontId()
    {
        return $this->fontId;
    }

    /**
     * @param mixed $fontId
     */
    public function setFontId($fontId)
    {
        $this->fontId = $fontId;
    }

    /**
     * @return mixed
     */
    public function getFontFormatVersion()
    {
        return $this->fontFormatVersion;
    }

    /**
     * @param mixed $fontFormatVersion
     */
    public function setFontFormatVersion($fontFormatVersion)
    {
        $this->fontFormatVersion = $fontFormatVersion;
    }

    /**
     * @return mixed
     */
    public function getFontCheckSum()
    {
        return $this->fontCheckSum;
    }

    /**
     * @param mixed $fontCheckSum
     */
    public function setFontCheckSum($fontCheckSum)
    {
        $this->fontCheckSum = $fontCheckSum;
    }

    /**
     * @return mixed
     */
    public function getDate()
    {
        return $this->date;
    }

    /**
     * @param mixed $date
     */
    public function setDate($date)
    {
        $this->date = $date;
    }

    /**
     * @return mixed
     */
    public function getNameEn()
    {
        return $this->nameEn;
    }

    /**
     * @param mixed $nameEn
     */
    public function setNameEn($nameEn)
    {
        $this->nameEn = $nameEn;
    }

    /**
     * @return mixed
     */
    public function getBytesTtf()
    {
        return $this->bytesTtf;
    }

    /**
     * @param mixed $bytesTtf
     */
    public function setBytesTtf($bytesTtf)
    {
        $this->bytesTtf = $bytesTtf;
    }

    /**
     * @return mixed
     */
    public function getBytesEot()
    {
        return $this->bytesEot;
    }

    /**
     * @param mixed $bytesEot
     */
    public function setBytesEot($bytesEot)
    {
        $this->bytesEot = $bytesEot;
    }

    /**
     * @return mixed
     */
    public function getBytesWoff()
    {
        return $this->bytesWoff;
    }

    /**
     * @param mixed $bytesWoff
     */
    public function setBytesWoff($bytesWoff)
    {
        $this->bytesWoff = $bytesWoff;
    }

    /**
     * @return mixed
     */
    public function getBytesWoff2()
    {
        return $this->bytesWoff2;
    }

    /**
     * @param mixed $bytesWoff2
     */
    public function setBytesWoff2($bytesWoff2)
    {
        $this->bytesWoff2 = $bytesWoff2;
    }

    /**
     * @return mixed
     */
    public function getContent()
    {
        return $this->content;
    }

    /**
     * @param mixed $content
     */
    public function setContent($content)
    {
        $this->content = $content;
    }

    /**
     * @return mixed
     */
    public function getApiKey()
    {
        return $this->apiKey;
    }

    /**
     * @param mixed $apiKey
     */
    public function setApiKey($apiKey)
    {
        $this->apiKey = $apiKey;
    }

    /**
     * @return mixed
     */
    public function getTtfUrl()
    {
        return $this->ttfUrl;
    }

    /**
     * @param mixed $ttfUrl
     */
    public function setTtfUrl($ttfUrl)
    {
        $this->ttfUrl = $ttfUrl;
    }

    /**
     * @return mixed
     */
    public function getWoffUrl()
    {
        return $this->woffUrl;
    }

    /**
     * @param mixed $woffUrl
     */
    public function setWoffUrl($woffUrl)
    {
        $this->woffUrl = $woffUrl;
    }

    /**
     * @return mixed
     */
    public function getWoff2Url()
    {
        return $this->woff2Url;
    }

    /**
     * @param mixed $woff2Url
     */
    public function setWoff2Url($woff2Url)
    {
        $this->woff2Url = $woff2Url;
    }

    /**
     * @return mixed
     */
    public function getEotUrl()
    {
        return $this->eotUrl;
    }

    /**
     * @param mixed $eotUrl
     */
    public function setEotUrl($eotUrl)
    {
        $this->eotUrl = $eotUrl;
    }


}