package com.skey.designpattern.singleton;

/**
 * 4种单例的测试
 *
 * @author ALion
 * @version 2019/1/25 22:10
 */
public class SingletonTest {

    public static void main(String[] args) {
        // 1.测试 -> 单例-饿汉式
        SingletonDemo01 instance1 = SingletonDemo01.getInstance();
        SingletonDemo01 instance2 = SingletonDemo01.getInstance();
        System.out.println(instance1 == instance2);

        // 2.测试 -> 单例-懒汉式（双重校验锁）
        SingletonDemo02 instance3 = SingletonDemo02.getInstance();
        SingletonDemo02 instance4 = SingletonDemo02.getInstance();
        System.out.println(instance3 == instance4);

        // 3.测试 -> 单例-静态内部类
        SingletonDemo03 instance5 = SingletonDemo03.getInstance();
        SingletonDemo03 instance6 = SingletonDemo03.getInstance();
        System.out.println(instance5 == instance6);

        // 4.测试 -> 单例-枚举
        SingletonDemo04 instance7 = SingletonDemo04.INSTANCE;
        SingletonDemo04 instance8 = SingletonDemo04.INSTANCE;
        System.out.println(instance7 == instance8);

    }

}
