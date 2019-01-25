package com.skey.designpattern.factory;

import com.skey.designpattern.factory.simple.PhoneFactory;

/**
 * 测试-简单工厂模式
 *
 * @author ALion
 * @version 2019/1/26 0:13
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Phone samsung = PhoneFactory.create("Samsung");
        Phone huawei = PhoneFactory.create("Huawei");

        samsung.call();
        huawei.call();
    }

}
