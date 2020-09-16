<?php
/**
 * Created by PhpStorm.
 * User: niyonghang
 * Date: 2020/2/27
 * Time: 4:45 PM
 */

namespace source\model;


class WebFontFace
{
    public $FontFamily = "";

    public $FontFace = "";

    public $Tag = "";

    public $Code = 200;

    public $ErrorMessage = "";

    public $Woff = "";

    public function toJSON(){
        return json_encode($this);
    }

    /**
     * @return string
     */
    public function getFontFamily()
    {
        return $this->FontFamily;
    }

    /**
     * @param string $FontFamily
     */
    public function setFontFamily($FontFamily)
    {
        $this->FontFamily = $FontFamily;
    }

    /**
     * @return string
     */
    public function getFontFace()
    {
        return $this->FontFace;
    }

    /**
     * @param string $FontFace
     */
    public function setFontFace($FontFace)
    {
        $this->FontFace = $FontFace;
    }

    /**
     * @return string
     */
    public function getTag()
    {
        return $this->Tag;
    }

    /**
     * @param string $Tag
     */
    public function setTag($Tag)
    {
        $this->Tag = $Tag;
    }

    /**
     * @return int
     */
    public function getCode()
    {
        return $this->Code;
    }

    /**
     * @param int $Code
     */
    public function setCode($Code)
    {
        $this->Code = $Code;
    }

    /**
     * @return string
     */
    public function getErrorMessage()
    {
        return $this->ErrorMessage;
    }

    /**
     * @param string $ErrorMessage
     */
    public function setErrorMessage($ErrorMessage)
    {
        $this->ErrorMessage = $ErrorMessage;
    }

    /**
     * @return string
     */
    public function getWoff()
    {
        return $this->Woff;
    }

    /**
     * @param string $Woff
     */
    public function setWoff($Woff)
    {
        $this->Woff = $Woff;
    }



}