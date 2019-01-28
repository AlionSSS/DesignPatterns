package com.skey.designpattern.prototype;

/**
 * 原型模式的性能测试
 * <p>
 *     new生成对象太慢时or同时间需要创建大量相同对象时，就使用原型模式
 * </p>
 *
 * @author ALion
 * @version 2019/1/28 23:34
 */
public class PerformanceTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 直接做家庭作业
        doHomework();

        // 抄（克隆）他人的作业
        cloneHomework();
    }

    public static void doHomework() {
        long start = System.currentTimeMillis();

        Homework homework = new Homework();
        for (int i = 0; i < 100; i++) {
            Homework homework2 = new Homework();
            System.out.println("do homework = " + i);
        }

        long end = System.currentTimeMillis();
        System.out.println("PerformanceTest.doHomework: 耗时" + (end - start) + "毫秒");
    }

    public static void cloneHomework() throws CloneNotSupportedException {
        long start = System.currentTimeMillis();

        Homework homework = new Homework();
        for (int i = 0; i < 100; i++) {
            Homework homework2 = homework.clone();
            System.out.println("clone homework = " + i);
        }

        long end = System.currentTimeMillis();
        System.out.println("PerformanceTest.cloneHomework: 耗时" + (end - start) + "毫秒");
    }

}
