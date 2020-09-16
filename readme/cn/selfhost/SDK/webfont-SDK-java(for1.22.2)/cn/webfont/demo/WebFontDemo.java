package cn.webfont.demo;

import cn.webfont.client.model.FontFaceParam;
import cn.webfont.client.model.WebFontFace;
import cn.webfont.client.WebFontClient;

public class WebFontDemo {

  public static void main(String[] args) throws Exception {
  
    WebFontClient client = new WebFontClient();
    //accessKey(第1个)参数是需要生成子集字体的字体ID，必填参数；
    //content(第2个)参数是需要生成子集字体的内容文本，必填参数；
    //Tag(第3个)参数是选择器代码(select)，如果填写Tag参数，则返回的@font-face语句会带有将webfont应用到选择器中的代码，选填参数；
    //URL(第4个)参数是自定义文件地址，如果填写URL参数，则SDK会按URL指定的地址来保存生成的字体文件(URL参数在不同请求中必须唯一，不唯一则会导致生成的文件相互覆盖)，选填参数。
    WebFontFace result = client.getFontFace(new FontFaceParam("d9ffb195f7e041d4a03fb8084f9c4fe5","中文test", "#id1","a/b/48888"));
    String jsonStr = result.toJson();
    System.out.println(jsonStr);
  }
}
