package com.skey.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 防止反射、反序列化破解单例的测试
 *
 * @author ALion
 * @version 2019/1/25 22:45
 */
public class AntiCrashSingletonTest {

    public static void main(String[] args) {
        // 测试反射
        reflect();

        // 测试反序列化
        unserializable();
    }

    public static void reflect() {
        // 1.测试 -> 反射破解单例
        try {
            SingletonDemo02 o1 = SingletonDemo02.getInstance();

            Class<SingletonDemo02> clazz = (Class<SingletonDemo02>) Class.forName("com.skey.designpattern.singleton.SingletonDemo02");
            Constructor<SingletonDemo02> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            SingletonDemo02 o2 = constructor.newInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 2.测试 -> 单例-防止反射破解
        try {
            SingletonDemo05 o3 = SingletonDemo05.getInstance();

            Class<SingletonDemo05> clazz05 = (Class<SingletonDemo05>) Class.forName("com.skey.designpattern.singleton.SingletonDemo05");
            Constructor<SingletonDemo05> constructor05 = clazz05.getDeclaredConstructor(null);
            constructor05.setAccessible(true);
            // 当对象已经实例化了后，再用反射去实例化，会报异常
            SingletonDemo05 o4 = constructor05.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void unserializable() {
        // 3.测试 -> 反序列化破解单例
        String path1 = "./test1.txt";
        SingletonDemo02Serializable o1 = SingletonDemo02Serializable.getInstance();
        try (FileOutputStream fos = new FileOutputStream(path1);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(o1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream(path1);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            SingletonDemo02Serializable o2 = (SingletonDemo02Serializable) ois.readObject();
            // 判断是否是同一个对象
            System.out.println(o2 == o1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 4.测试 -> 单例-防止反序列化破解
        String path2 = "./test2.txt";
        SingletonDemo05 o3 = SingletonDemo05.getInstance();
        try (FileOutputStream fos = new FileOutputStream(path2);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(o3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream(path2);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            SingletonDemo05 o4 = (SingletonDemo05) ois.readObject();
            // 判断是否是同一个对象
            System.out.println(o4 == o3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
