package com.skey.designpattern.singleton;

/**
 * 单例-懒汉式（双重校验锁）
 *
 * @author ALion
 * @version 2019/1/25 21:22
 */
public class SingletonDemo02 {

    private static SingletonDemo02 instance;

    // 私有，防止直接实例化（不过仍会被反射实例化）
    private SingletonDemo02() {
    }

    // 懒加载
    public static SingletonDemo02 getInstance() {
        // 先判断是否为null，可以提高效率，防止后续获取对象时，直接被锁住（消耗时间）
        // 注：网上有人直接在方法上加synchronized，忽略了这个优化点
        if (instance == null) {
            synchronized (SingletonDemo02.class) {
                // 防止重复创建对象
                if (instance == null) {
                    instance = new SingletonDemo02();
                }
            }
        }
        return instance;
    }

}
