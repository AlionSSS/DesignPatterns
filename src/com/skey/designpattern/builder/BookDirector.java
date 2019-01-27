package com.skey.designpattern.builder;

import java.util.ArrayList;

/**
 * 生产书籍的导演类
 * <p>
 *     这个类决定了生产书籍的流程。
 *     除了已有的打印流程，你还可以添加其他详细流程，例如：
 *     1.联系一家印刷厂
 *     2.建立一个修订的方法，对书的内容进行预处理（例如将内容排版改为由右至左），再打印
 *     3.根据纸张、作者、内容、人力等，计算生产书籍的成本
 * </p>
 *
 * @author ALion
 * @version 2019/1/27 20:04
 */
public class BookDirector {

    /**
     * 根据参数，按流程创建书籍
     * @param name 书名
     * @param author 作者
     * @param publisher 出版社
     * @param paper 纸张
     * @param article 文章
     * @return 书籍
     */
    static Book create(String name, String author, String publisher, Paper paper, Article article) {
        ArrayList<Paper> paperList = print(paper, article);
        return new Book(name, author, publisher, paperList);
    }

    /**
     * 印刷书籍内容部分
     *
     * @param paper   纸张
     * @param article 文章
     * @return 纸张页集合
     */
    private static ArrayList<Paper> print(Paper paper, Article article) {
        System.out.println("Builder.print => 准备打印书籍内容页");

        int quality = paper.getQuality();
        int size = paper.getSize();
        String content = article.getContent();

        ArrayList<Paper> paperList = new ArrayList<>();
        int length = content.length();
        for (int i = 0; i < length; i += size) {
            Paper p = new Paper(quality, size);
            int e = i + p.getSize() < length ? i + p.getSize() : length;
            p.setContent(content.substring(i, e));
            paperList.add(p);
            System.out.println("Builder.print => 完成第" + paperList.size() + "页打印");
        }

        System.out.println("Builder.print => 完成书籍内容页打印");
        return paperList;
    }

}
