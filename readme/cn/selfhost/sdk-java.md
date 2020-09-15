# 1、介绍

### SDK适用语言
SDK适用于在Java中调用字体子集化方法。

### 生成WebFont
调用接口时，用户可自定义字体存放路径(url参数)，当需要显示字体效果时，可以根据自己当初所定义的路径拼组出@font-face语句，然后将语句插入到前端页面的<style>标签中，即可使内容显示出WebFont效果。

### @font-face语句拼组
@font-face语句拼组格式如下：
```css
@font-face
{
    font-family: '{fontfamilyname}';
    src:url(https://cdn.webfont.com/webfonts/custompath/{UserKey}/{Url}.gif);
    src:url(https://cdn.webfont.com/webfonts/custompath/{UserKey}/{Url}.gif#iefix) format('embedded-opentype'),
    url(https://cdn.webfont.com/webfonts/custompath/{UserKey}/{Url}.png) format('woff2'),
    url(https://cdn.webfont.com/webfonts/custompath/{UserKey}/{Url}.bmp) format('woff'),
    url(https://cdn.webfont.com/webfonts/custompath/{UserKey}/{Url}.jpg) format('truetype');
}

/* 
{fontfamilyname}是由用户自定义的；它就是WebFont所创建的字体的名字，当某个标签要引用这个WebFont时，font-family必须与它一致；同一页面，不能重复创建相同的{fontfamilyname}。

{UserKey}是服务器为每个用户专门开僻的存储空间的名字，UserKey可以从用户后台获取。

{Url}即是调用接口时所提交的参数(url)。
*/
```
例如：
```css
@font-face
{
    font-family: 'NotoSansCJKsc-light';
    src:url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/page15.gif);
    src:url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/page15.gif#iefix) format('embedded-opentype'),
    url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/page15.png) format('woff2'),
    url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/page15.bmp) format('woff'),
    url(https://cdn.webfont.com/webfonts/custompath/89B7CC9B4E975C85/page15.jpg) format('truetype');
}
```


# 2、下载/部署

1)jar包方式引用<br/><br/>
    1.jdk1.6.0_31及以上 <br />
    2.依赖：<br />
       commons-httpclient-3.0.1<br />
       commons-logging-1.0.3<br />
       commons-codec-1.2<br />
       fastjson-1.2.5<br />
    3. - [下载SDK](https://github.com/youziku/youziku-sdk-java/raw/master/sdk%E4%B8%8B%E8%BD%BD/youziku.java.sdk.jars.zip "java") 

2)maven方式(推荐)
``` xml
    <dependency>
	<groupId>com.github.youziku</groupId>
	<artifactId>youziku.service.sdk</artifactId>
	<version>1.0</version>
    </dependency>
```
# 3、引用
添加引用"Youziku.SDK.v35.dll"。

# 4、Sample
## 1.初始化YouzikuServiceClient实例,在全局配置一遍即可
```java 
public static final IYouzikuServiceClient youzikuClent = new YouzikuServiceClient("xxxxxx");//xxxxxx为用户的apikey
```

## 2.调用接口

### 2.1.自定义模式：CreateBatchWebFont()

``` java
//构建一个请求参数
BatchCustomPathWoffFontFaceParam bcpwff2 = new BatchCustomPathWoffFontFaceParam();
bcpwff2.addData(new CustomPathFontFaceParam("xxx", "有字库，让中文跃上云端！", "youziku/test-1"));
bcpwff2.addData(new CustomPathFontFaceParam("xxx", "有字库，让前端掌控字体！", "youziku/test-2"));
//调用接口
BatchCustomPathWoffFontFaceResult result = youzikuClent.getCustomPathBatchWebFont(bcpwff2);
```



### 2.2 返回语句模式：GetBatchFontFace()


``` java
//构建一个请求参数
BatchFontFaceParam bff = new BatchFontFaceParam();
bff.addTag(new FontFaceParam("xxx", "有字库，让中文跃上云端！", "#id1"));
bff.addTag(new FontFaceParam("xxx", "有字库，让前端掌控字体！", "#id2"));
//调用接口
BatchFontFaceResult result = youzikuClent.getBatchFontFace(bff);
```
