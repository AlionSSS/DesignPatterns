package com.skey.designpattern.composite;

import com.skey.designpattern.composite.base.Component;

/**
 * 文本文件
 *
 * @author ALion
 * @version 2019/2/14 0:47
 */
public class TextFile implements Component {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void delete() {
        System.out.println(name + " TextFile.delete");
    }

}