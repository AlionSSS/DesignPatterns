package com.skey.designpattern.builder;

/**
 * 纸张
 *
 * @author ALion
 * @version 2019/1/27 18:28
 */
public class Paper {

    /** 纸张质量 */
    private int quality;

    /** 纸张能容纳的文字数 */
    private int size;

    /** 纸张上的文字内容 */
    private String content;

    public Paper(int quality, int size) {
        this.quality = quality;
        this.size = size;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
