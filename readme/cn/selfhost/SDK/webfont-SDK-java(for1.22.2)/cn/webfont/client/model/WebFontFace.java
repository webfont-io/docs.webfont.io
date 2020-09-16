package cn.webfont.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Data;

import java.io.Serializable;

@Data
public class WebFontFace implements Serializable {
  @JsonProperty("FontFamily")
  private String fontFamily = "";

  @JsonProperty("FontFace")
  private String fontFace = "";

  @JsonProperty("Tag")
  private String tag = "";

  @JsonProperty("Code")
  private int code = 200;

  @JsonProperty("ErrorMessage")
  private String errorMessage = "";

  @JsonProperty("Woff")
  private String woff = "";

  public String toJson() throws JsonProcessingException {
    // 以json格式输出
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
    return mapper.writeValueAsString(this);
  }
}
