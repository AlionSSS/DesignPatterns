package com.skey.designpattern.strategy;

/**
 * 策略模式测试
 *
 * @author ALion
 * @version 2019/2/17 22:24
 */
public class StrategyTest {

    public static void main(String[] args) {
        Strategy childStrategy = new ChildStrategy();
        Context context = new Context(childStrategy);
        context.printPrice(100);

        Strategy adultStrategy = new AdultStrategy();
        context.setStrategy(adultStrategy);
        context.printPrice(100);

    }

}
