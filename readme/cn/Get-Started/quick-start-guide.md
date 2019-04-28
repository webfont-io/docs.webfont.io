# 快速入门

> #### WebFont
> WebFont是CSS3中的一个模块，主要是把自定义的特殊字体嵌入到网页中，使页面文字可以显示出任意字体的效果（文字以文本形式显示而非图片模式）。
> #### 字体文件按需截取
> 然而，中文字体过于庞大，小则三五兆，大则十几兆二十几兆。如果整套嵌入到网页上，将严重影响网页的打开速度。
> 所以，我们推出“按需截取”(根据页面内容把字体中不需要的字型删除掉)服务，将中文字体压缩成和英文字体一样小巧玲珑。

# 主要功能
## 1,下载WebFont
我们提供在线生成WebFont功能，您可以免注册在线提交内容，然后将生成的WebFont文件下载文件到本地，真正“用完即走”模式。

文档：https://webfont.io/online.html


## 2,智能JS
我们提供智能JS插件，它可以智能检测网页上指定的内容→自动提交→自动生成WebFont文件→最后自动将WebFont引用到当前页面，并确保WebFont生效。当页面内容有更新，它也会智能感应→自动更新当前WebFont。

JS插件引用代码如下：

``` javascript

<script type="text/javascript" src="https://lib.webfont.com/fastjs.min.js"></script>
<script type="text/javascript">
   $webfont.load("seletor", "accesskey", "fontfamily");
   $webfont.draw();
</script>
```

文档：https://webfont.io/realtime.html

## 3,即时编辑（H5）
我们提供即时编辑插件，它是专门针对在线文字编辑场景设计。通过它调用中文字体，初始化时，无需加载任何字体数据，从而使页面得以极速展开。它会根据用户输入的内容快速获取需要的字型。即时响应，轻盈灵巧。

文档：https://webfont.io/fs.html


## 4,后端SDK
我们提供标准API接口，您可以通过程序调用来批量生成WebFont文件。为了方便您的应用，我们将API接口的调用代码打包成SDK，您可以通过SDK实现快速开发。

文档：https://webfont.io/sdk.html


# 独立部署（推荐）
如果您对稳定性和安全性有较高的要求，我们建议您将字体服务部署到您自己的服务器上，部署完成后，您的字体服务就从我们的公共服务器上分离，相互独立。并且，我们确保不会在任何时候访问您的服务器（您也可以将安全策略设置为拒绝外网连接）。

存储空间支持Bucket列表：

    - Aliyun OSS（阿里云oss）
    
    - Amazon S3 （亚马逊云）
    
    - 腾讯云

文档：https://webfont.io/selfhost.html
