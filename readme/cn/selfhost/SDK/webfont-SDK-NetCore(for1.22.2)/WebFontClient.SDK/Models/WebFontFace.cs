using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Text;

namespace WebFontClient.SDK.Models
{
    public class WebFontFace
    {
        public string FontFamily { get; set; } = "";

        public string FontFace { get; set; } = "";

        public string Tag { get; set; } = "";

        public int Code { get; set; } = 200;

        public string ErrorMessage { get; set; } = "";

        public string Woff { get; set; } = "";

        /// <summary>
        /// 输出此类的JSON格式
        /// </summary>
        /// <returns></returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this);
        }
    }
}
