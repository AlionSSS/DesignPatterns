package com.skey.designpattern.prototype;

import java.util.Date;

/**
 * 深克隆测试
 *
 * @author ALion
 * @version 2019/1/28 22:32
 */
public class DeepCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("------+--深克隆Test--+------");

        DeepApple apple = new DeepApple(10, "China", new Date());

        print(apple);

        System.out.println("------+------+------");

        DeepApple cloneApple = apple.clone();

        print(cloneApple);

        System.out.println("修改manufacture");
        apple.manufacture.setTime(10000000000L);
        System.out.println("apple.manufacture = " + apple.manufacture);
        System.out.println("cloneApple.manufacture = " + cloneApple.manufacture);
    }

    private static void print(Apple apple) {
        System.out.println("apple = " + apple);
        System.out.println("apple.size = " + apple.size);
        System.out.println("apple.place = " + apple.place);
        System.out.println("apple.manufacture = " + apple.manufacture);
    }

}
