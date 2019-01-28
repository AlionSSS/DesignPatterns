package com.skey.designpattern.prototype;

import java.util.Date;

/**
 * 可克隆的苹果（浅克隆）
 * <p>
 *     1.需要实现Cloneable接口
 *     2.覆写Object的clone方法
 * </p>
 *
 * @author ALion
 * @version 2019/1/28 22:21
 */
public class ShallowApple extends Apple {


    public ShallowApple(int size, String place, Date manufacture) {
        super(size, place, manufacture);
    }

    @Override
    protected ShallowApple clone() throws CloneNotSupportedException {
        // clone是native方法，直接调用C代码，效率高
        return (ShallowApple) super.clone();
    }

}
