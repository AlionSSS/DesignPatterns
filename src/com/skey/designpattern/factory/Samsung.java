package com.skey.designpattern.factory;

/**
 * 三星手机
 *
 * @author ALion
 * @version 2019/1/26 0:09
 */
public class Samsung implements Phone {

    @Override
    public void call() {
        System.out.println("Samsung.call");
    }

}
