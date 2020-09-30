# 1、Synopsis

### Java SDK
This SDK is suitable for Java projects, you can use it to call subsetting services. After adding it to the project, your program will use it to talk to the locallhost deployed subsetting services and produce subset fonts and @font-face code.

### Configure
#### The code to save the file
he source code of the SDK provides the code for storing files. It is the uploadoss() function in the WebFontClient.cs, by default, it saves the files to the storage device of Alibaba Cloud OSS,you can replace or rewrite it to save the file to the storage device you actually use.

The rules to replace or rewrite:
 - It can receive two parameters: file binary and file name;
 - It can save the file binary to the storage device with the file name;
 - It can return the url of the file binary on the storage device(The SDK will use it to assemble the @font-face code)
 
#### The variables
Open the WebFontClient.java File to change the values of apikey, host and port variables.
``` sh
apiKey：The value must be the same as the WEBFONT_APIKEY in the config file(docker-compose.yml or config.yml).
host：The value is the IP of the subsetting service .
port：The value is the port number of the subsetting service.
```



# 2、Sample

``` java
    WebFontClient client = new WebFontClient();   
    WebFontFace result = client.getFontFace(new FontFaceParam("XXXXXXXXXXXXXXXXXXXXXXXXXX","中文test", "#id1","aaa/bbb/ccc"));
    //The first parameter of the constructor is "accessKey",it is the FontID,required;
    //The second parameter of the constructor is "content",It is the content text,required;
    //The third parameter of the constructor is "Tag",It's the selector code,Optional;
    //The fourth argument of the constructor is "URL",It's the Custom address,Optional.
    String jsonStr = result.toJson();
    System.out.println(jsonStr);
```




