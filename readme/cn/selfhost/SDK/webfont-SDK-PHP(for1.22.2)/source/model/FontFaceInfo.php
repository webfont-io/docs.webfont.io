<?php
/**
 * Created by PhpStorm.
 * User: niyonghang
 * Date: 2020/2/27
 * Time: 4:13 PM
 */

namespace source\model;


class FontFaceInfo
{
    private $ttfUrl;
    private $woffUrl;
	private $woff2Url;
    private $eotUrl;

    private $fontId;
    private $nameEn;
    private $Tag;

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
    public function getTag()
    {
        return $this->Tag;
    }

    /**
     * @param mixed $Tag
     */
    public function setTag($Tag)
    {
        $this->Tag = $Tag;
    }


}