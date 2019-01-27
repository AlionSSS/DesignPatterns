package com.skey.designpattern.builder;

/**
 * 建造者模式测试
 *
 * @author ALion
 * @version 2019/1/27 20:14
 */
public class BuilderTest {

    public static void main(String[] args) {
        // 构建纸张属性
        Paper paper = new Paper(100, 50);

        // 构建文章
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("Romeo and Julie ").append(i);
        }
        Article article = new Article("literature", builder.toString());

        // 开始构建书籍
        Book book = new Book.Builder()
                .name("Romeo and Juliet")
                .author("William Shakespeare")
                .publisher("People's Literature Press")
                .paper(paper)
                .article(article)
                .build();

        // 展示数据
        book.show();
    }

}
