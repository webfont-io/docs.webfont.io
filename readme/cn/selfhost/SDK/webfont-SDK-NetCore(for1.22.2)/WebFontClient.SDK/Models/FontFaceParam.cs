using System;
using System.Collections.Generic;
using System.Text;

namespace WebFontClient.SDK.Models
{
    public class FontFaceParam
    {
        public string accessKey;
        public string content;
        public string tag;
        // 类似：a/b/font1
        public string url;

        public FontFaceParam(string accessKey, string content)
        {
            this.accessKey = accessKey;
            this.content = content;
        }

        public FontFaceParam(string accessKey, string content, string tag)
        {
            this.accessKey = accessKey;
            this.content = content;
            this.tag = tag;
        }

        public FontFaceParam(string accessKey, string content, string tag, string url)
        {
            this.accessKey = accessKey;
            this.content = content;
            this.tag = tag;
            this.url = url;
        }
    }
}
