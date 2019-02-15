package com.skey.designpattern.flyweight;

/**
 * 卡牌 - 内部状态
 *
 * @author ALion
 * @version 2019/2/16 0:44
 */
public class Card implements FlyWeight {

    private String shape;

    public Card(String shape) {
        this.shape = shape;
    }

    @Override
    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public void show(View view) {
        System.out.println("shape = " + shape);
        System.out.println("view = " + view);
    }

}
