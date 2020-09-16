using Aliyun.OSS;
using Aliyun.OSS.Common;
using Grpc.Net.Client;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;
using WebFontClient.SDK.Models;
using Webfontsdk;
using static Webfontsdk.Greeter;

namespace WebFontClient.SDK
{
    public class WebFontClient
    {
        #region 私有字段       
        /// <summary>
        /// gRPC通道
        /// </summary>
        private readonly GrpcChannel _channel;


        /// <summary>
        /// grpc客户端
        /// </summary>
        private readonly GreeterClient _client;

        /// <summary>
        /// 日志提供程序
        /// </summary>
        private readonly ILogger _logger;

        /// <summary>
        /// 需替换用户的address(部署webfont服务的服务器IP，格式ip:端口号,如:1.2.3.4:5000)
        /// </summary>
        private readonly string _address;

        /// <summary>
        /// 需替换用户的apiKey(apiKey是由docker-compose.yml里的WEBFONT_APIKEY定义，两者必须对应才能调用成功)
        /// </summary>
        private readonly string _apiKey;
        #endregion        

        /// <summary>
        /// OSS配置项
        /// </summary>
        private readonly OssConfig _ossConfig;

        #region 构造函数        

        public WebFontClient(string address, string apikey, OssConfig ossConfig)
        {
            if (!string.IsNullOrEmpty(address))
            {
                _address = address;
            }

            if (!string.IsNullOrEmpty(apikey))
            {
                _apiKey = apikey;
            }
            this._ossConfig = ossConfig;
            //客户端跨语言调用非tls gRPC这样设置,请求http，非https
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            _channel = GrpcChannel.ForAddress(_address);
            _client = new GreeterClient(_channel);

            //日志可去除
            var loggerFactory = LoggerFactory.Create(builder =>
            {
                builder.AddFilter("Microsoft", LogLevel.Warning)
                       .AddFilter("System", LogLevel.Warning)
                       .AddFilter("LoggingConsoleApp.Program", LogLevel.Debug);
            });
            //ILogger logger = loggerFactory.CreateLogger<WebFontClient>();
            _logger = loggerFactory.CreateLogger<WebFontClient>();
        }
        #endregion

        #region 私有方法
        /// <summary>
        /// 传入用户的字体的accesskey和需要处理的文本，然后进行构建字体库
        /// </summary>
        /// <param name="apikey">用户的apikey</param>
        /// <param name="accessKey">字体的accesskey</param>
        /// <param name="content">需要处理的文本</param>
        /// <returns></returns>
        private async Task<WebFontInfo> BuildFont(string apikey, string accessKey, string content)
        {
            FontBuildAccessKeyRequest request = new FontBuildAccessKeyRequest
            {
                Apikey = _apiKey,
                Accesskey = accessKey,
                Text = content,
                NeedTtf = true, //如果不需要此格式的文件返回，则此处参数设置为false
                NeedEot = false, //如果不需要此格式的文件返回，则此处参数设置为false
                NeedWoff = false, //如果不需要此格式的文件返回，则此处参数设置为false
                NeedWoff2 = false //如果不需要此格式的文件返回，则此处参数设置为false
            };

            try
            {
                var response = await _client.BuildFontForAccessKeyAsync(request);
                WebFontInfo webFontInfo = new WebFontInfo()
                {
                    apiKey = apikey,
                    fontId = (int)response.FontId,
                    content = content,
                    fontCheckSum = (long)response.FontChecksum,
                    fontFormatVersion = (int)response.FontFormatVersion,
                    nameEn = response.NameEn,
                    bytesTtf = response.BytesTtf.ToByteArray(),
                    bytesEot = response.BytesEot.ToByteArray(),
                    bytesWoff = response.BytesWoff.ToByteArray(),
                    bytesWoff2 = response.BytesWoff2.ToByteArray()
                };

                //---------------------------打印日志--------------------------


                return webFontInfo;
            }
            catch (Exception e)
            {
                _logger.Log(LogLevel.Warning, "RPC failed: {0}  Desc: {1}", new Object[] { e.Message, e.StackTrace });
                throw e;
            }

        }

        /// <summary>
        /// 构建多个字体库
        /// </summary>
        /// <param name="apiKey">用户的apikey</param>
        /// <param name="fontIds">字体ID数组</param>
        /// <param name="content">需要处理的文本</param>
        /// <returns></returns>
        private async Task<List<WebFontInfo>> Multbuild(string apiKey, int[] fontIds, string content)
        {
            MultFontBuildRequest buildRequest = new MultFontBuildRequest();
            foreach (var fontId in fontIds)
            {
                buildRequest.Items.Add(new FontBuildRequest
                {
                    Apikey = apiKey,
                    FontId = (uint)fontId,
                    Text = content,
                    NeedTtf = true
                 
                });
            }

            try
            {
                var response = await _client.MultBuildFontAsync(buildRequest);
                var webFontInfoList = new List<WebFontInfo>();
                foreach (var item in response.Items)
                {
                    webFontInfoList.Add(new WebFontInfo
                    {
                        fontId = (int)item.FontId,
                        content = content,
                        apiKey = apiKey,
                        fontCheckSum = (long)item.FontChecksum,
                        fontFormatVersion = (int)item.FontFormatVersion,
                        nameEn = item.NameEn,
                        bytesTtf = item.BytesTtf.ToByteArray(),
                        bytesEot = item.BytesEot.ToByteArray(),
                        bytesWoff = item.BytesWoff.ToByteArray()
                    });

                    _logger.Log(LogLevel.Information, "success build font:{0}", item.FontId);
                    _logger.Log(LogLevel.Information, "ttf len:{0}", item.BytesTtf.Length);
                    _logger.Log(LogLevel.Information, "eot len:{0}", item.BytesEot.Length);
                    _logger.Log(LogLevel.Information, "woff len:{0}", item.BytesWoff.Length);
                }

                return webFontInfoList;
            }
            catch (Exception e)
            {
                _logger.Log(LogLevel.Warning, "RPC failed: {0}  Desc: {1}", new Object[] { e.Message, e.StackTrace });
                return null;
            }
        }

        /// <summary>
        /// 将生成的webfont资源上传到存储空间里，并返回保存的地址，用于构建@font-face语句
        /// </summary>
        /// <param name="webFontInfo"></param>
        /// <param name="url">自定义保存路径</param>
        /// <returns></returns>
        private FontFaceInfo UploadFontFile(WebFontInfo webFontInfo, string url)
        {
            string objectBaseName = ""; // 类似：a/b/font1
            if (string.IsNullOrEmpty(url))
            {
                // 使用fontid+ randomid
                objectBaseName = $"fontface/{webFontInfo.fontId}/{Guid.NewGuid().ToString("N")}/{webFontInfo.nameEn}";
            }
            else
            {
                objectBaseName = url;
            }
            Console.WriteLine("objectBaseName:" + objectBaseName);

            string eotObjectName = objectBaseName + ".eot";
            string woffObjectName = objectBaseName + ".woff";
            string ttfObjectName = objectBaseName + ".ttf";
            string woff2ObjectName = objectBaseName + ".woff2";
            string eotUrlString = webFontInfo.bytesEot.Length != 0 ? UploadOss(webFontInfo.bytesEot, eotObjectName) : "";
            string woffUrlString = webFontInfo.bytesWoff.Length != 0 ? UploadOss(webFontInfo.bytesWoff, woffObjectName) : "";
            string woff2UrlString = webFontInfo.bytesWoff2.Length != 0 ? UploadOss(webFontInfo.bytesWoff2, woff2ObjectName) : "";
            string ttfUrlString = webFontInfo.bytesTtf.Length != 0 ? UploadOss(webFontInfo.bytesTtf, ttfObjectName) : "";

            return new FontFaceInfo()
            {
                eotUrl = eotUrlString,
                woffUrl = woffUrlString,
                woff2Url = woff2UrlString,
                ttfUrl = ttfUrlString,
                nameEn = webFontInfo.nameEn
            };
        }

        /// <summary>
        /// 将文件上传存储空间的方法（本SDK是用阿里云OSS作为存储空间）。
        /// 用户可以根据自身的情况重写该方法，重写时须注意该方法必须传入文件二进制流（byte[]）和文件名
        /// </summary>
        /// <param name="fontfile">文件二进制流</param>
        /// <param name="objectName">文件名</param>
        /// <returns></returns>
        private string UploadOss(byte[] fontfile, string objectName)
        {
            string endpoint = _ossConfig.Endpoint;
            string accessKeyId = _ossConfig.AccessKeyId;
            string accessKeySecret = _ossConfig.AccessKeySecret;
            string bucketName = _ossConfig.BucketName;

            // 创建OSSClient实例
            OssClient ossClient = new OssClient(endpoint, accessKeyId, accessKeySecret);
            try
            {
                var exists = ossClient.DoesBucketExist(bucketName);
                if (exists)
                {

                    ossClient.SetBucketAcl(bucketName, CannedAccessControlList.PublicRead);
                    ossClient.PutObject(bucketName, objectName, new MemoryStream(fontfile));
                    var expiration = DateTime.Now.AddDays(150);
                    var fontfileUrl = ossClient.GeneratePresignedUri(bucketName, objectName, expiration);
                    var fontfileString = fontfileUrl.ToString().Substring(0, fontfileUrl.ToString().IndexOf("?"));
                    Console.WriteLine("fontfileString: " + fontfileString);

                    return fontfileString;
                }
                else
                {
                    throw new OssException("bucket [" + bucketName + "] is not exist!");
                }
            }
            catch (OssException oe)
            {
                Console.WriteLine("Caught an OSSException, which means your request made it to OSS, but was rejected with an error response for some reason.");
                Console.WriteLine("Error Message: " + oe.Message);
                Console.WriteLine("Error Code: " + oe.ErrorCode);
                Console.WriteLine("Request ID: " + oe.RequestId);
                Console.WriteLine("Host ID: " + oe.HostId);
                throw oe;
            }
            catch (ClientException ce)
            {
                Console.WriteLine("Caught an ClientException, which means the client encountered a serious internal problem while trying to communicate with OSS, " +
                    "such as not being able to access the network.");
                Console.WriteLine(ce.StackTrace);
                throw ce;
            }
        }

        /// <summary>
        /// 根据webfont资源保存的地址来生成@font-face语句
        /// </summary>
        /// <param name="fontFaceInfo"></param>
        /// <returns></returns>
        private WebFontFace BuildWebFontFace(FontFaceInfo fontFaceInfo)
        {
            string fontface = "@font-face{font-family:'" + fontFaceInfo.nameEn + "';";

            //如果eot不为空
            if (!string.IsNullOrEmpty(fontFaceInfo.eotUrl))
            {
                fontface += "src:url('" + fontFaceInfo.eotUrl + "');";
            }

            fontface += "src:";

            //如果eot不为空
            if (!string.IsNullOrEmpty(fontFaceInfo.eotUrl))
            {
                fontface += "url('" + fontFaceInfo.eotUrl + "?#iefix')format('embedded-opentype'),";

            }
            //如果woff不为空
            if (!string.IsNullOrEmpty(fontFaceInfo.woffUrl))
            {
                fontface += "url('" + fontFaceInfo.woffUrl + "')format('woff'),";
            }

            //如果woff2不为空
            if (!string.IsNullOrEmpty(fontFaceInfo.woff2Url))
            {
                fontface += "url('" + fontFaceInfo.woff2Url + "')format('woff2'),";
            }

            //如果ttf不为空
            if (!string.IsNullOrEmpty(fontFaceInfo.ttfUrl))
            {
                fontface += "url('" + fontFaceInfo.ttfUrl + "')format('truetype'),";
            }

            fontface = fontface[0..^1];
            fontface += ";}";

            if (!string.IsNullOrEmpty(fontFaceInfo.Tag))
            {
                fontface += fontFaceInfo.Tag + "{font-family:'" + fontFaceInfo.nameEn + "'}";
            }

            //定义生成的@font-face语句里的font-family属性值，本SDK默认将字体的英文名字作为@font-face语句里的font-family属性值。
            return new WebFontFace()
            {
                FontFamily = fontFaceInfo.nameEn,
                FontFace = fontface,
                Tag = fontFaceInfo.Tag,
                Woff = fontFaceInfo.woffUrl
            };
        }

        #endregion

        #region 入口方法        
        /// <summary>
        /// 用户在程序中调用该方法，服务器生成webfont并返回@font-face语句
        /// </summary>
        /// <param name="param"></param>
        /// <returns></returns>
        public async Task<WebFontFace> GetFontFace(FontFaceParam param)
        {
            // step1 传入用户可使用的字体id和需要处理的文本，然后进行构建字体库
            WebFontInfo webfontinfo = await BuildFont(_apiKey, param.accessKey, param.content);

            // step2 将生成的webfont资源上传到存储空间里，并返回保存的地址，用于构建@font-face语句。
            FontFaceInfo fontFaceInfo = UploadFontFile(webfontinfo, param.url);

            // step3 设置Tag参数，Tag即是select代码，如果调用getFontFace()方法时填写此参数，则返回的@font-face语句会自动将效果引用至select上。
            fontFaceInfo.Tag = param.tag;

            // step4 释放GRPC Channel
            await _channel.ShutdownAsync();

            // step5 根据webfont资源保存的地址来生成@font-face语句。
            return BuildWebFontFace(fontFaceInfo);
        }
        #endregion
    }
}
