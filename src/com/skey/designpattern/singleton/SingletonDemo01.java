package com.skey.designpattern.singleton;

/**
 * 单例-饿汉式
 *
 * @author ALion
 * @version 2019/1/25 21:22
 */
public class SingletonDemo01 {

    // 类初始化，立即加载这个对象，天然线程安全，不过无法延时加载
    private static SingletonDemo01 instance = new SingletonDemo01();

    // 私有，防止直接实例化（不过仍会被反射实例化）
    private SingletonDemo01() {
    }

    // 无锁，效率高
    public static SingletonDemo01 getInstance() {
        return instance;
    }

}
