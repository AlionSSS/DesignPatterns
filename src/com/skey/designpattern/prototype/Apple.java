package com.skey.designpattern.prototype;

import java.util.Date;

/**
 * 苹果基类（不是必须写）
 *
 * @author ALion
 * @version 2019/1/28 22:56
 */
public class Apple implements Cloneable {

    protected int size;

    protected String place;

    protected Date manufacture;

    public Apple(int size, String place, Date manufacture) {
        this.size = size;
        this.place = place;
        this.manufacture = manufacture;
    }

}
