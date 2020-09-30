
## Deploying subsetting services in docker
    It is built on alpine 3.9
``` sh
#If it is running, stop it first
docker stop webfont-api && docker rm webfont-api

#Run docker 
docker run -d -it --name="webfont-api-v-1-0-35" -p 5000:5000 -e "WEBFONT_PORT=:5000" -e "WEBFONT_SERIALNUMBER=a9bd9453-99f7-5b91-9e81-5864d7732a05" -e "WEBFONT_APIKEY=123456" registry.cn-hangzhou.aliyuncs.com/webfont/webfontapi:1.22.3

#View log
docker logs webfont-api
```
## -e Environment variables
-  WEBFONT_SERIALNUMBER is serial number.
-  WEBFONT_PORT is the program grpc port, 127.0.0.1:5000 means only listening to localhost IP.
-  WEBFONT_APIKEY is apikey,When using API to call the subsetting service, the value of apikey passed in must be consistent with the value here to pass the verification.

## -p 5000:5000
    Open ports in virtual machines.

## Extensive reading
    Docker is a cross platform virtual machine application, which supports most operating systems and is the most popular container virtual technology.
## Reference documents：
docker documentation：

https://docs.docker.com/engine/reference/commandline/run/

Install docker：

https://www.docker.com/get-started
