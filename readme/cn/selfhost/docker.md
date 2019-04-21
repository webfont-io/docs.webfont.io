
## 推荐方式：Docker
    docker方式基于alpine3.9构建
``` sh
#如果已经运行了先停止运行
docker stop webfont-api && docker rm webfont-api

#运行docker 
docker run -d -it --name="webfont-api" -p 5000:5000 -e "WEBFONT_PORT=:5000" -e "WEBFONT_SERIALNUMBER=a9bd9453-99f7-5b91-9e81-5864d7732a05" -e "WEBFONT_APIKEY=123456" hkloudou/webfont-api:latest

#查看日志
docker logs webfont-api
```
## -e 环境变量
-  WEBFONT_SERIALNUMBER 是序列号
-  WEBFONT_PORT 是程序grpc端口(默认:5000) 监听所有ip的5000端口 127.0.0.1:5000 为仅监听本地ip
-  WEBFONT_APIKEY 是api密钥(默认随机生成，可以通过查看日志或docker里的配置文件/etc/webfont/conf.yml查看)，独立部署下由用户自行指定，可以为任意字符串，SDK调用的时候必须传入相同的字符串才可以校验通过。 

## -p 5000:5000
    开放虚拟机里的5000端口绑定到宿主机的5000端口

## 扩展阅读
    docker是一个跨平台的虚拟机应用，支持大部分操作系统，是目前最流行的容器虚拟技术。
## 参考文档： 
docker 文档：

https://docs.docker.com/engine/reference/commandline/run/

如何安装docker：

https://www.docker.com/get-started