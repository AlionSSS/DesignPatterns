package com.skey.designpattern.flyweight;

/**
 * 卡牌接口
 *
 * @author ALion
 * @version 2019/2/16 0:37
 */
public interface FlyWeight {

    void setShape(String shape);

    String getShape();

    void show(View view);

}
