# 1、Synopsis

### Python SDK
This SDK is suitable for Python projects, you can use it to call subsetting services. After adding it to the project, your program will use it to talk to the locallhost deployed subsetting services and produce subset fonts and @font-face code.
### Configure
#### The code to save the file
The source code of the SDK provides the code for storing files. It is the uploadoss() function in the WebFontClient.cs, by default, it saves the files to the storage device of Alibaba Cloud OSS,you can replace or rewrite it to save the file to the storage device you actually use.
The rules to replace or rewrite:
 - It can receive two parameters: file binary and file name;
 - It can save the file binary to the storage device with the file name;
 - It can return the url of the file binary on the storage device(The SDK will use it to assemble the @font-face code)

#### The variables
Open the webfont_client.py file to change the values of apiKey and addr variables.
``` sh
apiKey：The value must be the same as the WEBFONT_APIKEY in the config file(docker-compose.yml or config.yml).
addr：The value is the IP and port of the subsetting service .
```



# 2、Download

``` python
#install ali oss
sudo pip install oss2

#install uuid
sudo pip install uuid

#run demo
python webfont_demo.py
```
    


# 3、Sample

``` python
webFontFace = getFontFace(
{'accessKey': 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', 'content': '中文字体测试', 'tag': '#id1', 'url': ''})
#The first parameter of the constructor is "accessKey",it is the FontID,required;
#The second parameter of the constructor is "content",It is the content text,required;
#The third parameter of the constructor is "Tag",It's the selector code,Optional;
#The fourth argument of the constructor is "URL",It's the Custom address,Optional.
print('webFontInfo: ' + str(webFontFace))
```


