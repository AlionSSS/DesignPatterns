package com.skey.designpattern.composite;

import com.skey.designpattern.composite.base.Component;

/**
 * 视频文件
 *
 * @author ALion
 * @version 2019/2/14 0:47
 */
public class VideoFile implements Component {

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void delete() {
        System.out.println(name + " VideoFile.delete");
    }

}