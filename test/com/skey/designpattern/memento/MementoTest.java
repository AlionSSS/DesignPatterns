package com.skey.designpattern.memento;

/**
 * 备忘录模式测试
 *
 * @author ALion
 * @version 2019/2/18 0:29
 */
public class MementoTest {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Video video = new Video("Titanic", 100, 0);
        System.out.println(video);

        System.out.println("开始看电影");
        for (int i = video.getProgress(); i <= 70; i += 10) {
            video.setProgress(i);
            System.out.println("电影播放了" + i + "%了");
        }
        System.out.println(video);

        System.out.println("突然有事，需要出去，先备份一下当前记录");
        VideoMemento memento = video.memento();
        careTaker.setMemento("high tide", memento);

        for (int i = video.getProgress() + 10; i <= 100; i += 10) {
            video.setProgress(i);
            System.out.println("电影播放了" + i + "%了");
        }
        System.out.println(video);

        System.out.println("回家了，继续看Titanic，从备份记录处恢复");

        video.recovery(careTaker.getMemento("high tide"));
        System.out.println(video);

    }

}
