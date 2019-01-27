package com.skey.designpattern.builder;

/**
 * 文章
 *
 * @author ALion
 * @version 2019/1/27 18:27
 */
public class Article {

    /** 文章类型 */
    private String type;

    /** 文章内容 */
    private String content;

    public Article(String type, String content) {
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
