package com.skey.designpattern.decorator;

/**
 * 具体的装饰对象 - 运动员
 *
 * @author ALion
 * @version 2019/2/14 23:20
 */
public class SportsMan extends SpecificMan {

    public SportsMan(Go go) {
        super(go);
    }

    private void run() {
        System.out.println("跑步");
    }

    @Override
    public void go() {
        super.go();
        run();
    }

}
