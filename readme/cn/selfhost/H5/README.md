# 1、介绍

### H5即时编辑接口
对于H5在线编辑工具，要调用一套特殊字体，往往需要把整套字体事先加载到客户端。不仅影响用户体验，同时也带来巨大的流量成本。
应用此插件调用中文字体，初始化时，无需加载任何字体数据，使页面得以极速展开。插件会自动根据用户输入的内容快速生成临时的字体，存放于客户端缓存中。即时响应，轻盈灵巧。

### 部署
#### docker-compose方式部署H5服务
```
version: '2'
services:
  h5js:
    container_name: h5js-server
    image: 'registry.cn-hangzhou.aliyuncs.com/webfont/h5.server:1.20.1'
    restart: always
    command:
      node /app/main.js
    environment:
      WEBFONT_APIKEY: "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
      WEBFONT_SERVER: "127.0.0.1:5000"
    ports:
      - "8181:80"
 ```
-  h5js-server服务依赖webfont-api服务，在使用h5js-server服务前必须先确保webfont-api服务已经部署成功。
-  WEBFONT_APIKEY 是api密钥(默认与序列号一致)，它必须与webfont-api服务中的WEBFONT_APIKEY保持一致。
-  WEBFONT_SERVER是webfont-api服务的地址，docker一起部署时，不需要配置，当分离部署时，需要配置(webfont-api的ip和port)。
-  8181:80 开放虚拟机里的80端口绑定到宿主机的8181端口


### 配置
#### 引用JS库
将下面JS库引用到页面的<head>标签里。
```sh
h5js.new.min.js
```
#### 修改host地址
window.ENV_WEBFONT_SERVERURL的值即是指向H5服务器的地址，将这个ip地址替换为部署在本地的服务器地址+H5服务的端口号却可。
```javascript
window.ENV_WEBFONT_SERVERURL = "47.96.228.172:8181";// host service IP
```





# 2、Sample
### getFontFace()
``` javascript
var entity={
AccessKey:'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', 　//AccessKey即是字体的代码，需要登录有字库后，在目标字体的使用页面中获取。
Content:'xxxxx', 　　　　　　// Content即时当前需要用到的文字内容
Tag: '.test1'   　　　　　　　　　　　　　　　　　//可不填的参数
};
$youzikuClient.getFontFace(entity, function (result) {
console.log(result.FontFamily);　　　　　　　　//如果没有填写Tag参数，则需要通过FontFamily将字体效果应用于文字上
console.log(result.AccessKey);
console.log(result.Tag);
console.log(result.ErrorMessage);　　　　　　　//如果代码设置有问题，将返回错误信息。
console.log(result.Code);　　　　　　　        //如果返回结果正常Code为200。
});

```
### getBatchFontFace ()
``` javascript
var data = {
  Tags: []
};
data.Tags.push({ AccessKey: 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', Content: 'xxx', Tag: '.test1' });//Tag参数可不填
data.Tags.push({ AccessKey: 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', Content: 'xxx', Tag: '#id2' });     //Tag参数可不填
$youzikuClient.getBatchFontFace(data, function (result) {
  var length = result.FontfaceList.length;
  for (var i = 0; i< length; i++) {
    console.log(result.FontfaceList[i].Tag);
    console.log(result.FontfaceList[i].AccessKey);
    console.log(result.FontfaceList[i].FontFamily);
    console.log(result.FontfaceList[i].ErrorMessage);　　　　　　　//如果代码设置有问题，将返回错误信息。
    console.log(result.FontfaceList[i].Code);　　　　　　　        //如果返回结果正常Code为200。
  }
});
```





