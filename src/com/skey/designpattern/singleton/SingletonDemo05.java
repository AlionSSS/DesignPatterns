package com.skey.designpattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 单例-防止反射、反序列化
 *
 * @author ALion
 * @version 2019/1/25 21:22
 */
public class SingletonDemo05 implements Serializable {

    private static SingletonDemo05 instance;

    private SingletonDemo05() {
        // 防止反射实例化多个对象
        if (instance != null) {
            throw new RuntimeException("只能实例化一个对象");
        }
    }

    public static SingletonDemo05 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo05.class) {
                if (instance == null) {
                    instance = new SingletonDemo05();
                }
            }
        }
        return instance;
    }

    // 防止反序列化
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}
