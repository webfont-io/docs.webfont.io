# 推荐方式：docker-compose

## docker-compose.yml
```
version: '2'
services:
  webfont-api:
    container_name: webfont-api-v-1-0-35
    image: 'registry.cn-hangzhou.aliyuncs.com/webfont/webfontapi:1.22.3'
    environment:
      WEBFONT_PATH: '/etc/webfont'
      WEBFONT_APIKEY: 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
      WEBFONT_SERIALNUMBER: 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
    ports:
      - "5000:5000"
    volumes:
      - /etc/webfont:/etc/webfont
 ```

-  WEBFONT_SERIALNUMBER 是序列号
-  WEBFONT_APIKEY 是api密钥(请联系客服人员获取)，SDK调用的时候必须传入相同的字符串才可以校验通过。 
- 5000:5000  开放虚拟机里的5000端口绑定到宿主机的5000端口

## 参考文档： 
docker-compose 文档：

https://github.com/docker/compose

如何安装docker-compose：

https://docs.docker.com/compose/install/
