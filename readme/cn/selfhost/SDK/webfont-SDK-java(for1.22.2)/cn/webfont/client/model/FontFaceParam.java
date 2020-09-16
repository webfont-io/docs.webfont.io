package cn.webfont.client.model;

import lombok.Data;

@Data
public class FontFaceParam {
  private String accessKey;
  private String content;
  private String tag;
  // 类似：a/b/font1
  private String url;

  public FontFaceParam(String accessKey, String content) {
    this(accessKey, content, "", "");
  }

  public FontFaceParam(String accessKey, String content, String tag) {
    this(accessKey, content, tag, "");
  }

  public FontFaceParam(String accessKey, String content, String tag, String url) {
    this.accessKey = accessKey;
    this.content = content;
    this.tag = tag;
    this.url = url;
  }
}
