using System;
using System.Collections.Generic;
using System.Text;

namespace WebFontClient.SDK.Models
{
    public class OssConfig
    {
        public string Endpoint { get; set; }
        public string AccessKeyId { get; set; }
        public string AccessKeySecret { get; set; }

        public string BucketName { get; set; }
    }
}
