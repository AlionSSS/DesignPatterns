package com.skey.designpattern.factory.abstractfactory.screen;

/**
 * 高端屏幕
 *
 * @author ALion
 * @version 2019/1/26 1:27
 */
public class HighScreen implements Screen {

    @Override
    public void resolution() {
        System.out.println("HighScreen.resolution = " + "3000*2000");
    }

    @Override
    public void color() {
        System.out.println("HighScreen.color = " + "Good");
    }

}
