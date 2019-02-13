package com.skey.designpattern.composite;

import com.skey.designpattern.composite.base.Component;

/**
 * 图像文件
 *
 * @author ALion
 * @version 2019/2/14 0:45
 */
public class ImageFile implements Component {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void delete() {
        System.out.println(name + " ImageFile.delete");
    }

}
