package com.skey.designpattern.prototype;

/**
 * 家庭作业（用于测试原型模式性能）
 * <p>
 *     1.自己做家庭作业很慢
 *     2.直接抄（克隆）别人的很快
 * </p>
 *
 * @author ALion
 * @version 2019/1/28 23:37
 */
public class Homework implements Cloneable{

    public Homework() {
        try {
            // 完成家庭作业需要一定时间
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Homework clone() throws CloneNotSupportedException {
        return (Homework) super.clone();
    }
}
