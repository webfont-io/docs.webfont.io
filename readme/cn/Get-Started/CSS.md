# 下载WebFont

## 1,介绍
用户手动提交文字内容，即可获得所需要的子集字体文件。
文件包括WebFont四种格式文件(.ttf、.eot、.woff、.woff2)和一个CSS文件(.css)以及一个demo文件(.html)。
下载后，即可很方便地配置在自己的网站上，配置后WebFont效果的稳定性以及加载速度都取决于用户自己的服务器，不会受到本网站的影响。

## 2,配置WebFont
将文件下载并上传到自己的服务器上，然后再简单配置一下就能生效了。
配置方法如下：

1. 在目标页面引用下载下来的CSS文件；
也可以将该CSS文件中的@font-face语句取出，粘贴在目标页面上的style标签中（注意粘贴后要替换@font-face语句中的文件路径）。

CSS文件中的代码如：
 ``` css
@font-face
{
    font-family: '{fontfamilyname}';
    src:url({fontid}.eot);
    src:url({fontid}.eot#iefix) format('embedded-opentype'),
    url({fontid}.woff2) format('woff2'),
    url({fontid}.woff) format('woff'),
    url({fontid}.ttf) format('truetype');
}

```

2. 在目标页面的目标标签上设置style="font-family:{fontfamilyname}"（<u>{fontfamilyname}</u>是下载的WebFont所创建的字体名字（即CSS文件中@font-face语句定义的font-family）。

## 3,注意事项

1. 目标内容（要应用WebFont效果的内容）一定要与提交的内容相一致。
2. 目标内容不能超出提交的内容，超出则超出的内容将以系统默认字体效果显示。
3. 提交内容可以超出目标内容，但不宜超出过多，超出将导致子集文件无意义变大，造成流量浪费。
4. 目标内容如果有变动，则需要手工重新提交，并重新配置，如果嫌麻烦，可以试试我们的智能JS插件，它可以自动提交内容并自动完成配置。
