package com.skey.designpattern.composite;

import com.skey.designpattern.composite.base.Component;
import com.skey.designpattern.composite.base.Composite;

/**
 * 组合模式测试
 *
 * @author ALion
 * @version 2019/2/14 1:02
 */
public class CompositeTest {

    public static void main(String[] args) {
        Composite rootDir = new Directory("我的收藏");
        Composite imageDir = new Directory("图片");
        rootDir.add(imageDir);
        Composite videoDir = new Directory("视频");
        rootDir.add(videoDir);
        Composite textDir = new Directory("文档");
        rootDir.add(textDir);

        Component imageA = new ImageFile("AAAA.png");
        Component imageB = new ImageFile("BBBB.png");
        imageDir.add(imageA);
        imageDir.add(imageB);

        Component videoQ = new VideoFile("QQQQ.mp4");
        videoDir.add(videoQ);

        Component textS = new TextFile("SSSS.txt");
        textDir.add(textS);

        System.out.println("====== 删除-图片 ======");
        imageDir.delete();

        System.out.println("====== 删除-我的收藏 ======");
        rootDir.delete();

    }

}
