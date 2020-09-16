package cn.webfont.client.model;

import lombok.Data;

@Data
public class FontFaceInfo {

    private String ttfUrl;
    private String woffUrl;
    private String eotUrl;

    private int fontId;
    private String nameEn;
    private String Tag;
}
