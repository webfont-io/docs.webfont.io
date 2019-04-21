## java sdk


## 下载配套的独立部署程序
[下载教程](self-host-guide.html "下载教程")
## 下载sdk
```sh
git clone -b v1.0.16 https://github.com/webfont-io/webfont
cd webfont/sdk/java
./gradlew installDist
./build/install/examples/bin/webfont-client
```

## 说明
    WebFontClient 是一个可以重用的连接类，在 new WebFontClient("localhost", 5000); 的时候会监听一个 针对localhost的dns负载均衡。 建议定义成全局类
```java
public static WebFontClient client = new WebFontClient("localhost", 5000);
```