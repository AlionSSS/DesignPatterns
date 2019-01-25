package com.skey.designpattern.factory.abstractfactory.screen;

/**
 * 低端屏幕
 *
 * @author ALion
 * @version 2019/1/26 1:27
 */
public class LowScreen implements Screen {

    @Override
    public void resolution() {
        System.out.println("HighScreen.resolution = " + "1280*720");
    }

    @Override
    public void color() {
        System.out.println("HighScreen.color = " + "Bad");
    }

}
