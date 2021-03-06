## WebFont简介

#### WebFont是什么
- WebFont是CSS3中的一个模块，主要是通过@font-face语句把自定义的特殊字体嵌入到网页中，使页面文字可以摆脱安全字体的限制显示出任意字体的效果。
#### 中文WebFont解决方案
- 然而，中文字体过于庞大，小则三五兆，大则十几兆二十几兆。如果整套嵌入到网页上，将严重影响网页的打开速度；
- 通常，一个中文字体文件有几兆、几十兆甚至二十几兆字节，但是网页上可能只需要其中的几个、几十个或几百个文字。如果整套字体加载过来只用到一小部分，这就是巨大的浪费；
- 所以，我们推出“按需截取”(根据页面内容把字体中不需要的字型删除掉)服务，也就是字体子集化服务(Font SubSetting)，该服务可以将中文字体压缩成和英文字体一样小巧玲珑。

## 独立部署(私有化部署)
```sh
子集化服务支持独立部署(私有化部署)，就是将子集化服务的核心库部署在客户自己的服务器集群上(支持负载均衡、支持K8S等)。

```

独立部署服务已实现高可用性，响应速度达到毫秒级，可支持高并发高负载。如果您对稳定性和安全性有较高的要求，我们建议您将字体服务部署到您自己的服务器上，部署完成后，您的字体服务就从我们的公共服务器上分离，相互独立。并且，我们确保不会在任何时候访问您的服务器（您也可以将安全策略设置为拒绝外网连接）。


## 部署文档- 我们支持以下方式实现快速部署


- [docker-composer(推荐)](docker-compose.md "docker-composer")
- [docker](docker.md "docker")
- [ubuntu](ubuntu.md "ubuntu")
- [Mac OS](macos.md "Mac OS")
- [Windows](windows.md "Mac OS")
- [CentOS](centos.md "CentOS")
  
```sh
请根据情况选择适合的方式进行部署。
```
## SDK文档- 我们提供以下几种语言的SDK

- [Webfont-Api-SDK-Java](SDK/webfont-SDK-java(for1.22.2) "Java")
- [Webfont-Api-SDK-NetCore](SDK/webfont-SDK-NetCore(for1.22.2) "NetCore")
- [Webfont-Api-SDK-NetFramework](SDK/webfont-SDK-NetFramework(for1.22.2) "NetFramework")
- [Webfont-Api-SDK-NodeJs](SDK/webfont-SDK-nodejs(for1.22.2) "NodeJs")
- [Webfont-Api-SDK-PHP](SDK/webfont-SDK-PHP(for1.22.2) "PHP")
- [Webfont-Api-SDK-Python](SDK/webfont-SDK-Python(for1.22.2) "Python")
```sh
SDK是针对不同语言（目前支持.Net、Java、PHP、NodeJs、Python），将子集化服务API的调用方法打包封装，制作成方便用户调用的工具包。
SDK的代码开源，用户可以直接将其加入自己的项目中，加入项目后，用户需要根据自身情况修改源码中的存储方法，使API返回的字体文件能够保存在用户自己的存储空间里。
```
