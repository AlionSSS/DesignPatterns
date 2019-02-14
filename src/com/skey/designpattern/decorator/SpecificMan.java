package com.skey.designpattern.decorator;

/**
 * 装饰器 - 特殊的人
 *
 * @author ALion
 * @version 2019/2/14 23:17
 */
public class SpecificMan implements Go {

    private Go go;

    public SpecificMan(Go go) {
        this.go = go;
    }

    @Override
    public void go() {
        go.go();
    }
}
