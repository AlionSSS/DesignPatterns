package com.skey.designpattern.factory;

/**
 * 华为手机
 *
 * @author ALion
 * @version 2019/1/26 0:10
 */
public class Huawei implements Phone {

    @Override
    public void call() {
        System.out.println("Huawei.call");
    }

}
