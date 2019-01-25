package com.skey.designpattern.singleton;

import java.io.Serializable;

/**
 * 单例-懒汉式（双重校验锁）可序列化
 *
 * @author ALion
 * @version 2019/1/25 21:22
 */
public class SingletonDemo02Serializable implements Serializable {

    private static SingletonDemo02Serializable instance;

    private SingletonDemo02Serializable() {
    }

    public static SingletonDemo02Serializable getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo02Serializable.class) {
                if (instance == null) {
                    instance = new SingletonDemo02Serializable();
                }
            }
        }
        return instance;
    }

}
