# 1、Synopsis
### PHP SDK
This SDK is suitable for PHP projects, you can use it to call subsetting services. After adding it to the project, your program will use it to talk to the locallhost deployed subsetting services and produce subset fonts and @font-face code.
### Configure
#### The code to save the file
The source code of the SDK provides the code for storing files. It is the uploadoss() function in the WebFontClient.cs, by default, it saves the files to the storage device of Alibaba Cloud OSS,you can replace or rewrite it to save the file to the storage device you actually use.
The rules to replace or rewrite:
 - It can receive two parameters: file binary and file name;
 - It can save the file binary to the storage device with the file name;
 - It can return the url of the file binary on the storage device(The SDK will use it to assemble the @font-face code)
#### The variables
Open the WebFontClient.php file to change the values of $apiKey, $host and $port variables.
``` sh
$apiKey：The value must be the same as the WEBFONT_APIKEY in the config file(docker-compose.yml or config.yml).
$host：The value is the IP of the subsetting service .
$port：The value is the port number of the subsetting service.
```



# 2、Download

## Prerequisites

This requires `php` >= 5.5, `pecl`, `composer`, `grpc.so`, `crul.so`

## Install extension

 - Install the `grpc` extension

   ```sh
   $ [sudo] pecl install grpc
   ```
- Install the `crul` extension

  ```sh
  $ [sudo] pecl install crul
  ```

## Try

 - Run the demo

   ```
   $ cd grpc-client/
   $ php WebFontDemo.php
   ```

 - How to use the SDK

   ```
   Consult the WebFontDemo.php
   ```


    


# 3、Sample

``` PHP
$client = new \source\WebFontClient;
$res = $client->getFontFace(new \source\model\FontFaceParam('xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx',"中文test", "#id1",""));
//The first parameter of the constructor is "accessKey",it is the FontID,required;
//The second parameter of the constructor is "content",It is the content text,required;
//The third parameter of the constructor is "Tag",It's the selector code,Optional;
//The fourth argument of the constructor is "URL",It's the Custom address,Optional.
echo $res->toJSON();
```





