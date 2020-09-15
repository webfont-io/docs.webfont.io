# 1、介绍

### SDK适用语言
该SDK适用于在PHP项目中调用本地部署好的服务的API。将该SDK加入到项目中后，程序将通过SDK实现与本地部署好的子集化服务进行交互，生成需要的子集字体和可以直接应用的WebFont代码。

### 配置
#### 文件存储
SDK中内置的上传存储空间的代码是OSS的上传代码。可以根据自身的情况（使用的存储空间类型）替换或重写该方法（uploadOss()方法）。
替换或重写时须注意该方法必须传入文件二进制流（byte[]）和文件名，返回文件的完整存储地址（SDK需要使用该地址来构建@font-face语句）。

#### ApiKey和服务器地址
在SDK中的WebFontClient.php文件中，将变量$apiKey，$host ，$port的值根据自身情况替换为实际的值了可。
``` sh
$apiKey：$apiKey必须与配置文件(docker-compose.yml或config.yml)里的WEBFONT_APIKEY相匹配，两者必须一致才能调用成功。
$host：$host是部署webfont服务的服务器IP。
$port：$port是部署webfont服务的服务器的端口号。
```



# 2、下载/部署

- [下载SDK](https://github.com/youziku/youziku-sdk-java/raw/master/sdk%E4%B8%8B%E8%BD%BD/youziku.java.sdk.jars.zip "java") <br />


    


# 3、Sample

``` PHP
$client = new \source\WebFontClient;
$res = $client->getFontFace(new \source\model\FontFaceParam('xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx',"中文test", "#id1",""));
echo $res->toJSON();
```


