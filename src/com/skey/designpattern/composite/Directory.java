package com.skey.designpattern.composite;

import com.skey.designpattern.composite.base.Component;
import com.skey.designpattern.composite.base.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录
 *
 * @author ALion
 * @version 2019/2/14 0:49
 */
public class Directory implements Composite {

    private String name;

    private List<Component> files = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void delete() {
        for (Component component : files) {
            component.delete();
        }
        System.out.println(name + " Directory.delete");
    }

    @Override
    public void add(Component component) {
        files.add(component);
    }

    @Override
    public void remove(Component component) {
        files.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return files.get(index);
    }

}
