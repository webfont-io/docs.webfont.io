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
