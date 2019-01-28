package com.skey.designpattern.prototype;

import java.util.Date;

/**
 * 可克隆的苹果（深克隆）
 * <p>
 *     1.需要实现Cloneable接口
 *     2.覆写Object的clone方法，同时把属性也克隆
 * </p>
 *
 * @author ALion
 * @version 2019/1/28 22:21
 */
public class DeepApple extends Apple {


    public DeepApple(int size, String place, Date manufacture) {
        super(size, place, manufacture);
    }

    @Override
    protected DeepApple clone() throws CloneNotSupportedException {
        // clone是native方法，直接调用C代码，效率高
        DeepApple apple = (DeepApple) super.clone();
        // 深克隆需要同时把属性对象也克隆
        apple.manufacture = (Date) this.manufacture.clone();
        return apple;
    }
}
