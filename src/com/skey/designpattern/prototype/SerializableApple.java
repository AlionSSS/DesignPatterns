package com.skey.designpattern.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 可序列化的苹果（深克隆）
 *
 * @author ALion
 * @version 2019/1/28 22:21
 */
public class SerializableApple implements Serializable {

    public int size;

    public String place;

    public Date manufacture;

    public SerializableApple(int size, String place, Date manufacture) {
        this.size = size;
        this.place = place;
        this.manufacture = manufacture;
    }

}
