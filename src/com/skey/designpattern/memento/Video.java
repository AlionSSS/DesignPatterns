package com.skey.designpattern.memento;

/**
 * 视频
 *
 * @author ALion
 * @version 2019/2/18 0:21
 */
public class Video {

    private String name;

    private int size;

    // 播放进度
    private int progress;

    public Video(String name, int size, int progress) {
        this.name = name;
        this.size = size;
        this.progress = progress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    /**
     * 备份
     */
    public VideoMemento memento() {
        return new VideoMemento(this);
    }

    /**
     * 从备份处恢复
     * @param memento 备份
     */
    public void recovery(VideoMemento memento) {
        this.name = memento.getName();
        this.size = memento.getSize();
        this.progress = memento.getProgress();
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", progress=" + progress +
                '}';
    }

}
