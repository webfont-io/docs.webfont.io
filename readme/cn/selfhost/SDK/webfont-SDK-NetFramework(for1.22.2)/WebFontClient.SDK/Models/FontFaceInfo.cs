using System;
using System.Collections.Generic;
using System.Text;

namespace WebFontClient.SDK.Models
{
    public class FontFaceInfo
    {
        public string ttfUrl { get; set; }
        public string woffUrl { get; set; }
        public string woff2Url { get; set; }
        public string eotUrl { get; set; }
        public int fontId { get; set; }
        public string nameEn { get; set; }
        public string Tag { get; set; }
    }
}
