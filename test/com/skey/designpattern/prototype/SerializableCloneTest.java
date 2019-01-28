package com.skey.designpattern.prototype;

import java.io.*;
import java.util.Date;

/**
 * 序列化、反序列化的方式实现深克隆 测试
 *
 * @author ALion
 * @version 2019/1/28 23:20
 */
public class SerializableCloneTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("------+--深克隆Test--+------");

        SerializableApple apple = new SerializableApple(10, "China", new Date());

        print(apple);

        System.out.println("------+------+------");

        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(apple);
        byte[] bytes = bos.toByteArray();
        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        SerializableApple cloneApple = (SerializableApple) ois.readObject();

        print(cloneApple);

        System.out.println("修改manufacture");
        apple.manufacture.setTime(10000000000L);
        System.out.println("apple.manufacture = " + apple.manufacture);
        System.out.println("cloneApple.manufacture = " + cloneApple.manufacture);
    }

    private static void print(SerializableApple apple) {
        System.out.println("apple = " + apple);
        System.out.println("apple.size = " + apple.size);
        System.out.println("apple.place = " + apple.place);
        System.out.println("apple.manufacture = " + apple.manufacture);
    }

}
