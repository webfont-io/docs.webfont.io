# 智能JS插件

## 1,介绍

智能JS插件是针对普通内容展示性网站设计的，适合企业网站、新闻网站等。该插件应用简单：只需要把JS插件引用至页面，然后设置一下选择器和字体，即可使页面指字文字显示出指定字体效果。So easy!!!

噢，对了，别忘了在后台把您的域名添加到白名单里。


>应用了JS插件的页面，JS插件会自动根据当前页面的内容，从字体原文件上裁切出一个小字库（只包含当前页面内容涉及到的字型，没用到的字型统统删除），然后自动将字体通过@font-face语句引用到当前页面，保证在浏览者打开这张页面时，页面上的字体显示出开发人员预期的效果。
>通过JS插件的“按需裁切”，大大降低了字体原文件的大小，使中文字体也像英文字体一样轻盈灵巧，易于加载。

## 2,JS库

将下面JS库引用到页面的\<head\>标签里。
 ``` javascript
<script type="text/javascript" src="https://lib.webfont.com/fastjs.min.js"></script>
<script type="text/javascript">
   $webfont.load("seletor", "accesskey", "fontfamily");
   /*$webfont.load("seletor", "accesskey", "fontfamily");*/
   $webfont.draw();
</script>
//第一个参数"seletor"请设置选择器代码（如:#id1、.class1、h1等），多个选择器，请用英文逗号隔开（如:"#id1,.class1,h1"）。
//第二个参数"accesskey"请您设置要使用的字体的Accesskey。
//第三个参数"fontfamily"请设置字体的英文名。

```
>JS插件可支持英文字体替换功能，即内容中的英文使用其他英文字体来显示，只需要在$webfont.load语句中的第三个参数中添加指定的英文字体名字（如：\$webfont.load("seletor1", "accesskey", "<u>**Helvetica**</u>,Source-Han-Light");）。

>JS插件可支持同一个页面上引用多个WebFont，
