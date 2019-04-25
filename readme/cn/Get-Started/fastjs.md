# H5即时编辑接口

## 1,介绍

对于H5在线编辑工具，要调用一套特殊字体，往往需要把整套字体事先加载到客户端。不仅影响用户体验，同时也带来巨大的流量成本。

我们针对在线文字编辑场景，提供专门的插件。应用此插件调用中文字体，初始化时，无需加载任何字体数据，使页面得以极速展开。根据用户输入的内容快速获取需要的字型。即时响应，轻盈灵巧。

## 2,JS库

引用JS库。
将下面JS库引用到页面的<head>标签里。
 
 ``` javascript
<script type="text/javascript" src="https://lib.webfont.com/h5js.min.js"></script>
```

## 3,调用方法

### 1、getFontFace()
``` javascript
var entity={
        AccessKey:'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', 　//AccessKey即是字体key
        Content:'xxxxx',　　　　　　　　　　　　　　　　　 // Content即是当前需要用到的文字内容
        Tag: '.test1'　　　　　　　　　　　　　　　　　　　//可不填的参数
};
$youzikuClient.getFontFace(entity, function (result) {
        console.log(result.FontFace);　
        console.log(result.FontFamily);　　　　　　　  　
        console.log(result.AccessKey);
        console.log(result.Tag);
        console.log(result.ErrorMessage);　　　　　　　
        console.log(result.Code);　　　　　　　          
});
```

### 2、getBatchFontFace ()
``` javascript
var data = {
        Tags: []
};
data.Tags.push({ AccessKey: 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', Content: 'xxx', Tag: '.test1' });
data.Tags.push({ AccessKey: 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', Content: 'xxx', Tag: '#id2' }); 
$youzikuClient.getBatchFontFace(data, function (result) {
        var length = result.FontfaceList.length;
        for (var i = 0; i< length; i++) {
                console.log(result.FontfaceList[i].Tag);
                console.log(result.FontfaceList[i].FontFace);
                console.log(result.FontfaceList[i].FontFamily);
                console.log(result.FontfaceList[i].AccessKey);
                console.log(result.FontfaceList[i].ErrorMessage);
                console.log(result.FontfaceList[i].Code);
        }
});
```
