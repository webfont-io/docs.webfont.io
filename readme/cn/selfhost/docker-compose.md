# docker-compose

## docker-compose.yml
```
  version: '2'
  services:
    webfont-api:
      container_name: webfont-api
      image: 'registry.cn-hangzhou.aliyuncs.com/webfont/webfont-api:v1.0.35'
      restart: always
      environment:
        WEBFONT_APIKEY: '123456'
        WEBFONT_SERIALNUMBER: 'a9bd9453-99f7-5b91-9e81-5864d7732a05'
      ports:
        - "5000:5000"
 ```

-  WEBFONT_SERIALNUMBER 是序列号
-  WEBFONT_APIKEY 是api密钥(默认随机生成，可以通过查看日志或docker里的配置文件/etc/webfont/conf.yml查看)，独立部署下由用户自行指定，可以为任意字符串，SDK调用的时候必须传入相同的字符串才可以校验通过。 
- 5000:5000  开放虚拟机里的5000端口绑定到宿主机的5000端口

## 参考文档： 
docker-compose 文档：

https://github.com/docker/compose

如何安装docker-compose：

https://docs.docker.com/compose/install/
