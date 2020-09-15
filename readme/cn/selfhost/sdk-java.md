# 1、介绍

### SDK适用语言
该SDK适用于在Java项目中调用本地部署好的服务的API。将该SDK加入到项目中后，程序将通过SDK实现与本地部署好的子集化服务进行交互，生成需要的子集字体和可以直接应用的WebFont代码。

### 配置
#### 上传存储空间代码
SDK中内置的上传存储空间的代码是OSS的上传代码。可以根据自身的情况（使用的存储空间类型）替换或重写该方法（uploadOss()方法）。
替换或重写时须注意该方法必须传入文件二进制流（byte[]）和文件名，返回文件的完整存储地址（SDK将使用该地址构建@font-face语句）。

#### ApiKey和服务器地址
在SDK中的WebFontClient.java文件中，将变量apiKey，host ，port的值根据自身情况替换为实际的值了可。
``` sh
apiKey：apiKey是由docker-compose.yml里的WEBFONT_APIKEY定义，两者必须对应才能调用成功。
host：host是部署webfont服务的服务器IP。
port：port是部署webfont服务的服务器的端口号。
```



# 2、下载/部署

1)jar包方式引用<br/><br/>
    1. - [下载SDK](https://github.com/youziku/youziku-sdk-java/raw/master/sdk%E4%B8%8B%E8%BD%BD/youziku.java.sdk.jars.zip "java") 
    2.jdk1.6.0_31及以上 <br />

    


# 3、Sample

``` java
    WebFontClient client = new WebFontClient();
    //accessKey(第1个)参数是需要生成子集字体的字体ID，必填参数；
    //content(第2个)参数是需要生成子集字体的内容文本，必填参数；
    //Tag(第3个)参数是选择器代码(select)，如果填写Tag参数，则返回的@font-face语句会带有将webfont应用到选择器中的代码，选填参数；
    //URL(第4个)参数是自定义文件地址，如果填写URL参数，则SDK会按URL指定的地址来保存生成的字体文件(URL参数在不同请求中必须唯一，不唯一则会导致生成的文件相互覆盖)，选填参数。
    WebFontFace result = client.getFontFace(new FontFaceParam("d9ffb195f7e041d4a03fb8084f9c4fe5","中文test", "#id1","a/b/48888"));
    String jsonStr = result.toJson();
    System.out.println(jsonStr);
```


