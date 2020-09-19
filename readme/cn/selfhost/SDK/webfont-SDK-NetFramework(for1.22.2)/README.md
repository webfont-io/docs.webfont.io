# 1、介绍

### SDK适用语言
该SDK适用于在Net Framework项目中调用已在本地部署完成的字体服务的API。将该SDK加入到项目中后，程序将通过SDK实现与本地部署好的子集化服务进行交互，生成需要的子集字体和可以直接应用的WebFont代码。

### 配置
#### 文件存储
SDK中内置的上传存储空间的代码是OSS的上传代码。可以根据自身的情况（使用的存储空间类型）替换或重写该方法（uploadOss()方法）。
替换或重写时须注意该方法必须传入文件二进制流（byte[]）和文件名，返回文件的完整存储地址（SDK需要使用该地址来构建@font-face语句）。

#### ApiKey和服务器地址
在SDK中的WebFontClient.cs文件中，_apiKey，_address的值根据自身情况替换为实际的值了可。
``` sh
_apiKey：_apiKey必须与配置文件(docker-compose.yml或config.yml)里的WEBFONT_APIKEY相匹配，两者必须一致才能调用成功。
_address：host(部署webfont服务的服务器IP)+port(部署webfont服务的服务器的端口号)。
```


   


# 2、Sample

``` C#
SDK.WebFontClient client = new SDK.WebFontClient();           
WebFontFace result = client.GetFontFace(new FontFaceParam("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "中文test(.net core is best)", "#id1", ""));
//FontFaceParam构造函数的第1个参数：accessKey参数是需要生成子集字体的字体ID，必填参数；
//FontFaceParam构造函数的第2个参数：content参数是需要生成子集字体的内容文本，必填参数；
//FontFaceParam构造函数的第3个参数：Tag参数是选择器代码(select)，如果填写Tag参数，则返回的@font-face语句会带有将webfont应用到选择器中的代码，选填参数；
//FontFaceParam构造函数的第4个参数：URL参数是自定义文件地址，如果填写URL参数，则SDK会按URL指定的地址来保存生成的字体文件(URL参数在不同请求中必须唯一，不唯一则会导致生成的文件相互覆盖)，如果不填写，则系统会在指定文件夹下自动创建，选填参数。
var jsonStr = result.ToJson();
Console.WriteLine(jsonStr);
```
