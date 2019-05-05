# 1、介绍

### SDK适用语言
SDK适用于在Nodejs中调用字体子集化方法。

### 生成WebFont
调用接口时，用户可自定义字体存放路径(url参数)，当需要显示字体效果时，可以根据自己当初所定义的路径拼组出@font-face语句，然后将语句插入到前端页面的<style>标签中，即可使内容显示出WebFont效果。

### @font-face语句拼组
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
{fontfamilyname}是由用户自定义的；它就是WebFont所创建的字体的名字，当某个标签要引用这个WebFont时，font-family必须与它一致；同一页面，不能重复创建相同的{fontfamilyname}。

{UserKey}是服务器为每个用户专门开僻的存储空间的名字，UserKey可以从用户后台获取。

{Url}即是调用接口时所提交的参数(url)。
*/
```
例如：
```css
@font-face
{
    font-family: 'NotoSansCJKsc-light';
    src:url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/page15.gif);
    src:url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/page15.gif#iefix) format('embedded-opentype'),
    url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/page15.png) format('woff2'),
    url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/page15.bmp) format('woff'),
    url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/page15.jpg) format('truetype');
}
```



# 2、引用
## npm安装
``` npm
npm install youziku@9.0.1 
```

# 3、Sample
## 1.初始化YouzikuClient
``` node
var youziku =require("youziku");
var youzikuClient = new youziku.youzikuClient("xxxxxx"); //apikey
```

## 2.调用接口

### 2.1.自定义模式：CreateBatchWebFont()


``` node
var cdata = {
    Datas: []
};

cdata.Datas.push({ AccessKey: 'xxxxxx', Content: '有字库，让中文跃上云端！自定义路径接口', Url: 'youziku/test1' });
cdata.Datas.push({ AccessKey: 'xxxxxx', Content: '有字库，让中文跃上云端，中国文字之美！', Url: 'youziku/test2' });


youzikuClient.createBatchWebFont(cdata, function (result) {
    console.log(result.Code);
    console.log(result.ErrorMessage); 
})


```




### 2.2 返回语句模式：GetBatchFontFace()


``` node
var data = {
    Tags: []
};

data.Tags.push({ AccessKey: 'xxxxxx', Content: '有字库，让中文跃上云端！', Tag: '.test1' });
data.Tags.push({ AccessKey: 'xxxxxx', Content: '有字库，让中文跃上云端,中国文字之美！', Tag: '#id2' });


youzikuClient.getBatchFontFace(data, function (result) {
    var length = result.FontfaceList.length;
    for (var i = 0; i < length; i++) {
        console.log(result.FontfaceList[i].Tag);
        console.log(result.FontfaceList[i].FontFace);
        console.log(result.FontfaceList[i].FontFamily);
    
    }
        console.log(result.Code);
        console.log(result.ErrorMessage);
});

```
