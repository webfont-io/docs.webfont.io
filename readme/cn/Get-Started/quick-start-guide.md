# 快速入门

## （中/日/韩）字体文件按需分割
通常一个字体文件有十几兆字节，但是网页上可能只需要其中的几十几百个文字，我们提供字体按需子集化分割的技术。

## 在线服务生成js/css
我们提供在线生成 js/css 方式让您可以快速使用，您可以下载文件到本地（适用于网站内容不变的情况下）

网址：https://webfont.io/online.html
## 实时生成字体文件：
我们提供实时接口，当检测到网站指定标签的内容变动的时候，就会自动更新在线的字体文件
``` javascript
<script type="text/javascript" src="http://cdn.webfont.apiatm.com/wwwroot/js/wf/webfont.api.min.js"></script>
<script type="text/javascript">
   $webfont.load("body", "yourkey", "Source-Han-Light");
   $webfont.draw();
</script>
```
网址：https://webfont.io/realtime.html

## SDK 调用
我们提供在线sdk调用的方式，让您可以快速生成css文件，支持Bucket列表：
    - Aliyun OSS（阿里云oss）
    - Amazon S3 （亚马逊云）
    - 腾讯云

网址：https://webfont.io/sdk.html
## 独立部署（推荐）
如果您对稳定性有非常高的要求，我们建议您部署服务到您自己的服务器，这部分程序是开源的，我们确保不会在任何时候访问您的服务器。