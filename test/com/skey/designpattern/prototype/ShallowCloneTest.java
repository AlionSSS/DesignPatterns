package com.skey.designpattern.prototype;

import java.util.Date;

/**
 * 浅克隆测试
 *
 * @author ALion
 * @version 2019/1/28 23:12
 */
public class ShallowCloneTest {


    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("------+--浅克隆Test--+------");

        ShallowApple apple = new ShallowApple(10, "China", new Date());

        print(apple);

        System.out.println("------+------+------");

        ShallowApple cloneApple = apple.clone();

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
