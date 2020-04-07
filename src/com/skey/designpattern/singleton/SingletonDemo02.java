package com.skey.designpattern.singleton;

/**
 * 单例-懒汉式（双重校验锁）
 *
 * @author ALion
 * @version 2019/1/25 21:22
 */
public class SingletonDemo02 {

    // volatile防止优化器对指令重排序（会导致线程不安全）
    // 原先创建顺序：1.对象版半始化 2.调用对象init方法，完成初始化 3.获取到对象
    // JIT优化重排序后：1.对象版半始化 2.获取到对象 3.调用对象init方法，完成初始化
    // 解释: 重排序后，获取到的对象是半初始化的对象，直接使用可能导致部分问题
    private static volatile SingletonDemo02 instance;

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
