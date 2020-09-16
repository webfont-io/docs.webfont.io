<?php
/**
 * Created by PhpStorm.
 * User: niyonghang
 * Date: 2020/2/27
 * Time: 3:16 PM
 */

namespace source\model;


class FontFaceParam
{
    private $accessKey;
    private $content;
    private $tag;

    // 类似：a/b/font1
    private $url;

    /**
     * FontFaceParam constructor.
     * @param $accessKey
     * @param $content
     * @param $tag
     * @param $url
     */
    public function __construct($accessKey, $content, $tag, $url)
    {
        $this->accessKey = $accessKey;
        $this->content = $content;
        $this->tag = $tag;
        $this->url = $url;
    }


    /**
     * @return mixed
     */
    public function getAccessKey()
    {
        return $this->accessKey;
    }

    /**
     * @param mixed $accessKey
     */
    public function setAccessKey($accessKey)
    {
        $this->accessKey = $accessKey;
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
    public function getTag()
    {
        return $this->tag;
    }

    /**
     * @param mixed $tag
     */
    public function setTag($tag)
    {
        $this->tag = $tag;
    }

    /**
     * @return mixed
     */
    public function getUrl()
    {
        return $this->url;
    }

    /**
     * @param mixed $url
     */
    public function setUrl($url)
    {
        $this->url = $url;
    }


}