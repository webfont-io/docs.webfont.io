using System;
using System.Collections.Generic;
using System.Text;

namespace WebFontClient.SDK.Models
{
    public class WebFontInfo
    {
        public const long serialVersionUID = 7974743939894430021L;
        public int fontId;
        public int fontFormatVersion;
        public long fontCheckSum;
        public long date;
        public string nameEn;
        public byte[] bytesTtf;
        public byte[] bytesEot;
        public byte[] bytesWoff;
        public byte[] bytesWoff2;
        public string content;
        public string apiKey;
        public string ttfUrl;
        public string woffUrl;
        public string woff2Url;
        public string eotUrl;
    }
}
