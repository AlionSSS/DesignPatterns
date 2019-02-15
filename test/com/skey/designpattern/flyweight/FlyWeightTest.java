package com.skey.designpattern.flyweight;

/**
 * 享元模式测试
 *
 * @author ALion
 * @version 2019/2/16 0:51
 */
public class FlyWeightTest {

    public static void main(String[] args) {
        Card card1 = CardFactory.getCard("rectangle");
        Card card2 = CardFactory.getCard("rectangle");

        System.out.println(card1 == card2);

        card1.show(new View("A"));
        card2.show(new View("B"));
    }

}
