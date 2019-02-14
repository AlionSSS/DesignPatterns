package com.skey.designpattern.decorator;

/**
 * 具体的装饰对象 - 超人
 *
 * @author ALion
 * @version 2019/2/14 23:22
 */
public class SuperMan extends SpecificMan {

    public SuperMan(Go go) {
        super(go);
    }

    private void fly() {
        System.out.println("飞行");
    }

    @Override
    public void go() {
        super.go();
        fly();
    }

}
