package com.skey.designpattern.memento;

/**
 * 视频备份
 *
 * @author ALion
 * @version 2019/2/18 0:22
 */
public class VideoMemento {

    private String name;

    private int size;

    // 播放进度
    private int progress;

    public VideoMemento(Video video) {
        this.name = video.getName();
        this.size = video.getSize();
        this.progress = video.getProgress();
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }


    public int getProgress() {
        return progress;
    }

}
