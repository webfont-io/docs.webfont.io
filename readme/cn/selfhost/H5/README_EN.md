# Synopsis

### h5 plug-in
For H5 online editing tools, when your user needs to edit text content online, when he needs to use multiple fonts to test the effect, you will often load multiple fonts to the client. This will inevitably slow down the performance of H5 tools, which not only affects the user experience, but also brings huge traffic costs. Use H5 plug-in now：
-  When the webpage is opened, it does not need to load any font data, so that the webpage can be expanded quickly;
-  It can respond in milliseconds when changing fonts;
-  It will quickly generate temporary subset fonts according to the content entered by the user and store them in the client cache;
-  Instant response, light and dexterous, without slow down the performance

# Deployment the capabilities
### Use docker-compose deployment the capabilities
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
-  The "h5js-server" service depends on the "webfont-api" service, so you must confirm that the "webfont-api" service has been deployed successfully before using the "h5js-server" service.
-  WEBFONT_APIKEY: It must be the same as WEBFONTAPI_KEY in webfont service。
-  WEBFONT_SERVER:It is the address of the "webfont-api" service
-  8181:80:Open port 80 in the virtual machine to bind to port 8181 of the host


### Web client code
#### Reference the javascript library
```sh
<script type="text/javascript" src="h5js.new.min.js"></script>
```
#### Set the host address
window.ENV_WEBFONT_SERVERURL:Its value is the address of the H5 server(ip + port).
```javascript
<script type="text/javascript">
   window.ENV_WEBFONT_SERVERURL = "127.0.0.1:8181";// host service IP
</script>
```





# 3、Sample
### getFontFace()
``` javascript
var entity={
AccessKey:'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', 
Content:'xxxxx', 　　　　　
Tag: '.test1'   　　　　　　　　　　　　　　　　
};
$youzikuClient.getFontFace(entity, function (result) {
console.log(result.FontFamily);　　　　　　　
console.log(result.AccessKey);
console.log(result.Tag);
console.log(result.ErrorMessage);　　　　　　　
console.log(result.Code);　　　　　　　       
});

```
### getBatchFontFace ()
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
    console.log(result.FontfaceList[i].AccessKey);
    console.log(result.FontfaceList[i].FontFamily);
    console.log(result.FontfaceList[i].ErrorMessage);　　　　　　
    console.log(result.FontfaceList[i].Code);　　　　　　　       
  }
});
```





