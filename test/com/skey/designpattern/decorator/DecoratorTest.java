package com.skey.designpattern.decorator;

/**
 * 装饰模式测试
 *
 * @author ALion
 * @version 2019/2/14 23:24
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Man man = new Man();
        man.go();

        System.out.println("-------------------");
        SportsMan sportsMan = new SportsMan(man);
        sportsMan.go();

        System.out.println("-------------------");
        SuperMan superMan = new SuperMan(man);
        superMan.go();

        System.out.println("-------------------");
        SuperMan superMan2 = new SuperMan(new SportsMan(new Man()));
        superMan2.go();

    }

}
