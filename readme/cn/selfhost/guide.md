# 快速入门

> #### WebFont是什么
> WebFont是CSS3中的一个模块，主要是把自定义的特殊字体嵌入到网页中，使页面文字可以摆脱安全字体的限制显示出任意字体的效果（文字以文本形式显示而非图片模式）。
> #### 中文WebFont解决方案
> 然而，中文字体过于庞大，小则三五兆，大则十几兆二十几兆。如果整套嵌入到网页上，将严重影响网页的打开速度。
> 所以，我们推出“按需截取”(根据页面内容把字体中不需要的字型删除掉)服务，也就是字体子集化服务(Font SubSetting)，该服务可以将中文字体压缩成和英文字体一样小巧玲珑。
```sh
该服务支持独立部署(私有化部署)，就是将核心功能部署在客户自己的服务器集群上(支持负载均衡、支持K8S等)。
部署完成后，客户就可以通过服务的API来调用部署在自己服务器上的字体子集化服务。
```
## 独立部署(私有化部署)
独立部署服务已实现高可用性，响应速度达到毫秒级，可支持高并发高负载。如果您对稳定性和安全性有较高的要求，我们建议您将字体服务部署到您自己的服务器上，部署完成后，您的字体服务就从我们的公共服务器上分离，相互独立。并且，我们确保不会在任何时候访问您的服务器（您也可以将安全策略设置为拒绝外网连接）。


## 部署文档- 我们支持以下方式实现快速部署


- [docker-composer(推荐)](docker-compose.md "docker-composer")
- [docker](docker.md "docker")
- [ubuntu](ubuntu.md "ubuntu")
- [Mac OS](macos.md "Mac OS")
- [Windows](windows.md "Mac OS")
- [CentOS](centos.md "CentOS")
  

## SDK文档- 我们提供以下几种语言的SDK

- [Webfont-Api-SDK-java](sdk-java.md "Java")
- [Webfont-Api-SDK-NetCore](sdk-netcore.md "NetCore")
- [Webfont-Api-SDK-NetFramework](sdk-netframework.md "NetFramework")
- [Webfont-Api-SDK-nodejs](sdk-nodejs.md "NodeJs")
- [Webfont-Api-SDK-PHP](sdk-php.md "PHP")
- [Webfont-Api-SDK-Python](sdk-python.md "Python")
