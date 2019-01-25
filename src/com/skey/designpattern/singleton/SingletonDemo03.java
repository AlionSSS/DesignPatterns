package com.skey.designpattern.singleton;

/**
 * 单例-静态内部类（推荐）
 * <p>
 *     优点：懒加载、高效
 * </p>
 * @author ALion
 * @version 2019/1/25 21:22
 */
public class SingletonDemo03 {

    // 私有，防止直接实例化（不过仍会被反射实例化）
    private SingletonDemo03() {
    }

    // 懒加载，只有该方法被调用，才会加载（因为只有静态内部类被调用，才会实例化该对象）
    public static SingletonDemo03 getInstance() {
        return InnerClass.instance;
    }

    // 静态内部类保证多线程加载的安全性
    private static class InnerClass {
        private static final SingletonDemo03 instance = new SingletonDemo03();
    }

}
