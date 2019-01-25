package com.skey.designpattern.factory.simple;

/**
 * 简单工厂-手机的工厂
 *
 * @author ALion
 * @version 2019/1/26 0:18
 */
public class PhoneFactory {

    public static Phone create(String type) {
        Phone phone = null;
        switch (type) {
            case "Samsung":
                phone = new Samsung();
                break;
            case "Huawei":
                phone = new Huawei();
            default:

        }
        return phone;
    }

}
