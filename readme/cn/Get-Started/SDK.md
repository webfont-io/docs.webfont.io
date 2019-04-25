# 后端SDK

## 1,介绍

#### 中文动态子集化服务
>SDK其实是针对不同语言（目前支持Golang、.Net、Java、PHP、NodeJs、C++、Ruby、Python），将API接口打包封装，形成更方便用户后台程序调用WebFont的动态子集化服务的工具包，SDK将实体类型的参数转为API接口字符串类型的参数，然后用内置的Post方法提交到对应的API接口，当收到API接口的返回值(json类型)时，将返回值实体化。

我们专注于动态子集化方案的应用与优化，本文档即是面向后端程序提供的动态子集化服务的SDK文档。
用户通过后端程序调用SDK，提交页面内容，服务器根据所提交的内容生成相对应的专属子集字体文件。当内容在前台显示时，引用这个子集字体文件，即可使页面内容产生预期的字体效果。


## 2,工作流程   
    ①用户用后端程序调用SDK，提交动态内容到子集化(裁切)服务器
    ②服务器接收到所提交内容后，根据内容裁剪出对应的小字体文件，并转换为4种通用字体格式（woff、eot、ttf、woff2）
    ③服务器将所有字体文件按用户指定的地址上传至CDN
    ④用户使用字体时，用自定义的路径，按@font-face格式来拼出能兼容所有浏览器的@font-face语句
   
   
## 3,@font-face语句拼组
@font-face语句拼组格式如下：
```css
@font-face
{
    font-family: '{fontfamilyname}';
    src:url(https://cdn.webfont.com/webfonts/custompath/{UserKey}/{Url}.gif);
    src:url(https://cdn.webfont.com/webfonts/custompath/{UserKey}/{Url}.gif#iefix) format('embedded-opentype'),
    url(https://cdn.webfont.com/webfonts/custompath/{UserKey}/{Url}.png) format('woff2'),
    url(https://cdn.webfont.com/webfonts/custompath/{UserKey}/{Url}.bmp) format('woff'),
    url(https://cdn.webfont.com/webfonts/custompath/{UserKey}/{Url}.jpg) format('truetype');
}

/* 
{fontfamilyname}是用户指定的；
{fontfamilyname}就是WebFont字体的名字，此处定义成什么名字，标签引用时，就必须也用这个名字；
同一页面，不能定义重复的{fontfamilyname}。

{UserKey}是服务器为每个用户专门开僻的存储空间的名字，UserKey可以从用户后台获取。

{Url}即是调用接口时所提交的参数(url)。
*/
```
例如：
```css
@font-face
{
    font-family: 'NotoSansCJKsc-light';
    src:url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/index.gif);
    src:url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/index.gif#iefix) format('embedded-opentype'),
    url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/index.png) format('woff2'),
    url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/index.bmp) format('woff'),
    url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/index.jpg) format('truetype');
}
```
