package com.skey.designpattern.factory;

import com.skey.designpattern.factory.method.HuaweiFactory;
import com.skey.designpattern.factory.method.SamsungFactory;

/**
 * 方法工厂测试
 *
 * @author ALion
 * @version 2019/1/26 0:48
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        Phone huawei = new HuaweiFactory().create();
        Phone samsung = new SamsungFactory().create();

        huawei.call();
        samsung.call();
    }

}
