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
   $webfont.draw();
</script>
//第一个参数"seletor"请设置选择器代码（如:#id1、.class1、h1等），多个选择器，请用英文逗号隔开（如:"#id1,.class1,h1"）。
//第二个参数"accesskey"请您设置要使用的字体的Accesskey。
//第三个参数"fontfamily"请设置字体的英文名。

```
>JS插件可支持英文字体替换功能，即内容中的英文使用其他英文字体来显示。只需要在$webfont.load语句中的第三个参数中添加指定的英文字体名字即可。
>例如:
 ``` javascript
$webfont.load("body", "8888888888888888888888", "Helvetica,Source-Han-Light"); 
//内容中的英文将以Helvetica字体显示，中文将以Source-Han-Light字体显示）。
```
>JS插件可支持同一个页面上引用多个WebFont，只需要添加多行$webfont.load语句即可，然后根据情况设置各自的选择器、Accesskey和fontfamily。
>例如：
 ``` javascript
$webfont.load(".title", "8888888888888888888888", "LiDeBiao-Xing3"); 
$webfont.load("#text", "9999999999999999999999", "SiYuanRegular"); 
//class为title的标签显示为LiDeBiao-Xing3字本，id为text的标签显示为SiYuanRegular字体。
```
## 3,URL中带变动的参数

>JS插件是通过当前页面的URL为key来存放页面相应的字体的，所以新的页面（新的URL）首次打开时，会有闪烁的现象，那是服务器在生成字体并将字体注册在当前新的URL(新的key)下；
如果URL带有参数，且参数每次打开或刷新都会变动，那么页面就会一直存在闪烁的现象，因为每次打开JS插件都认为是新页面。

如果参数的变动对于应用了在线字体的那部分内容没有影响（如微信分享时自动加的后缀），那么可以通知JS插件，让JS插件不去理会这些参数(也就是说，这些参数无论怎样变动，都不会被JS插件识别为新的URL)，具体操作方法如下：
1,在JS地址后面添加一个英文问号(?)即可让JS插件不去理会当前URL所有的参数，也就是说，无论参数怎样变动，页面都不会再闪烁了。
```javascript
<script type="text/javascript" src="https://lib.webfont.com/fastjs.min.js?"></script>
```
2,在JS地址后面通过param参数来指示哪些参数需要保留，多个参数用“|”隔开（这些参数变动，会影响应用了在线字体的那部分内容），其他的参数忽略。
```javascript
<script type="text/javascript" src="https://lib.webfont.com/fastjs.min.js?param=page|proid"></script>
```
3,在JS地址后面通过noparam参数来指示哪些参数需要忽略，多个参数用“|”隔开（这些参数变动，不会影响应用了在线字体的那部分内容），其他的参数保留。
```javascript
<script type="text/javascript" src="https://lib.webfont.com/fastjs.min.js?noparam=page|proid"></script>
```
