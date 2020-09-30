# Deploying subsetting services in docker-compose

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

-  WEBFONT_SERIALNUMBER is serial number
-  WEBFONT_APIKEY is apikey,When using API to call the subsetting service, the value of apikey passed in must be consistent with the value here to pass the verification.
-  5000:5000 is open ports in virtual machines.

## Reference documents：
docker-compose documentation：

https://github.com/docker/compose

Install docker-compose：

https://docs.docker.com/compose/install/
