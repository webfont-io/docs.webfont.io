## WebFont Synopsis

#### What is the WebFont
- WWebFont is a module in CSS3. It uses @font-face code to embed custom special fonts into web pages, so that page text can get rid of the restrictions of safe fonts and display arbitrary font effects.
#### Chinese WebFont
- Because Chinese fonts are too large, the larger ones are 20-30M bytes. If you embed the entire font on your webpage, it will seriously affect the opening speed of the webpage;
- Usually, a Chinese font file is 10-20M bytes, but only 10-100 glyph may be used on the webpage.SO, you load the whole set of fonts but only use a small part, which is a huge waste;
- Therefore, we launched the "Assemble as needed" service (delete unnecessary glyph from the font file according to the content on the page) service, it is a font subsetting service, it can compress Chinese fonts as small as English fonts , It solves the problem that the Chinese font file is too large to load online.


#### High-availability API
- We have developed a high-efficiency and high-stability API interface. You only need to use the program to submit the text content and fontID, and the API will return a subset of the font (in the subset font, only the glyph involved in the text content are included) .
- It has now achieved high-availability, response speed of millisecond level, and supports high concurrency and high load.


## Separate Deployment(Privatization Deployment)
```sh
The subsetting services support separate deployment(Privatization Deployment)————Deploy the core library of subsetting services on your own server

```

- If you have high requirements for stability and security, then you will need to deploy the subsetting service on your own server;
- The separately deployed subsetting services can achieve high availability, response speed of millisecond, and support high concurrency and high load;
- Separately deployed subsetting services support load balancing and k8s;
- Once the deployed, the subsetting service will run completely independently;
- Once the deployed, you will be able to ensure that it will not be accessed by the Internet at any time(For example, you can set your security policy to deny Internet connections).

## Deployment Documentation - The following methods are supported


- [docker-composer(recommend)](docker-compose.md "docker-composer")
- [docker](docker.md "docker")
- [ubuntu](ubuntu.md "ubuntu")
- [Mac OS](macos.md "Mac OS")
- [Windows](windows.md "Mac OS")
- [CentOS](centos.md "CentOS")
  
```sh
Please choose the appropriate deployment method according to your situation.
```
## SDK documentation - The following languages are supported

- [Webfont-Api-SDK-Java](SDK/webfont-SDK-java(for1.22.2) "Java")
- [Webfont-Api-SDK-NetCore](SDK/webfont-SDK-NetCore(for1.22.2) "NetCore")
- [Webfont-Api-SDK-NetFramework](SDK/webfont-SDK-NetFramework(for1.22.2) "NetFramework")
- [Webfont-Api-SDK-NodeJs](SDK/webfont-SDK-nodejs(for1.22.2) "NodeJs")
- [Webfont-Api-SDK-PHP](SDK/webfont-SDK-PHP(for1.22.2) "PHP")
- [Webfont-Api-SDK-Python](SDK/webfont-SDK-Python(for1.22.2) "Python")
```sh
SDK is an easy-to-use toolkit that encapsulates the calling methods of subsetting services for different languages
SDK is open source. You can modify it or add it to your project;
After joining the project, you need to modify the storage method in the source code to save the font file returned by the API in your storage device.
```
