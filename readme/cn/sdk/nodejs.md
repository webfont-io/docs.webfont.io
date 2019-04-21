## nodejs sdk


## 下载配套的独立部署程序
[下载教程](self-host-guide.html "下载教程")
## 下载sdk
```sh
git clone -b v1.0.16 https://github.com/webfont-io/webfont
cd webfont/sdk/node
node ./fontlist.js
```


## 说明
```js
var client = new services.GreeterClient('localhost:5000',grpc.credentials.createInsecure());
```
    client对象建议定义成全局变量 grpc 会根据 localhost 进行dns的负载均衡监听，并且支持自动重连