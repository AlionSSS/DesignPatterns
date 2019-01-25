package com.skey.designpattern.factory.abstractfactory.screen;

/**
 * 中端屏幕
 *
 * @author ALion
 * @version 2019/1/26 1:27
 */
public class MediumScreen implements Screen {

    @Override
    public void resolution() {
        System.out.println("HighScreen.resolution = " + "1920*1080");
    }

    @Override
    public void color() {
        System.out.println("HighScreen.color = " + "Normal");
    }

}
