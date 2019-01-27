package com.skey.designpattern.builder;

import java.util.ArrayList;

/**
 * 书 - 建造者模式
 *
 * @author ALion
 * @version 2019/1/27 18:26
 */
public class Book {

    private String name;

    /** 作者 */
    private String author;

    /** 出版社 */
    private String publisher;

    /** 内容页 */
    private ArrayList<Paper> paperList;


    Book(String name, String author, String publisher, ArrayList<Paper> paperList) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.paperList = paperList;
    }

    /**
     * 展示书籍
     */
    public void show() {
        System.out.println("---------------------------------------");
        System.out.println("name = " + name);
        System.out.println("author = " + author);
        System.out.println("publisher = " + publisher);
        System.out.println("paperContent = " + paperList.get(0).getContent());
        System.out.println("paperContent = " + paperList.get(1).getContent());
        System.out.println("paperContent = " + "……………………………………");
        System.out.println("paperContent = " + paperList.get(paperList.size() - 1).getContent());
        int price = paperList.size() * 10;
        System.out.println("price = " + price + "$");
        System.out.println("---------------------------------------");
    }

    /**
     * 建造者类 - 供外部调用
     */
    public static class Builder {

        private Paper paper;

        private Article article;

        private String author;

        private String publisher;

        private String name;

        /**
         * 设置纸张属性
         * @param paper 纸张
         * @return Book.Builder
         */
        public Builder paper(Paper paper) {
            this.paper = paper;
            return this;
        }

        /**
         * 设置文章
         * @param article 文章
         * @return Book.Builder
         */
        public Builder article(Article article) {
            this.article = article;
            return this;
        }

        /**
         * 设置作者
         * @param author 作者
         * @return Book.Builder
         */
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 设置出版社
         * @param publisher 出版社
         * @return Book.Builder
         */
        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            // 此处使用导演类，按某个流程生成书籍
            return BookDirector.create(name, author, publisher, paper, article);
        }

    }

}
