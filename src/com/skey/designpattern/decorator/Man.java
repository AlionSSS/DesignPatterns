package com.skey.designpattern.decorator;

/**
 * 人
 *
 * @author ALion
 * @version 2019/2/14 23:16
 */
public class Man implements Go{

    @Override
    public void go() {
        System.out.println("普通的走");
    }

}
