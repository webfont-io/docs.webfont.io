package cn.webfont.client.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigInteger;

@Data
@ToString(exclude = {"bytesTtf", "bytesEot", "bytesWoff","bytesWoff2"})
public class WebFontInfo implements Serializable {

  private static final long serialVersionUID = 7974743939894430021L;
  private int fontId;
  private int fontFormatVersion;
  private long fontCheckSum;
  private long date;
  private String nameEn;

  private byte[] bytesTtf;
  private byte[] bytesEot;
  private byte[] bytesWoff;
  private byte[] bytesWoff2;
  private String content;
  private String apiKey;

  private String ttfUrl;
  private String woffUrl;
  private String eotUrl;
  private String woff2Url;
}
