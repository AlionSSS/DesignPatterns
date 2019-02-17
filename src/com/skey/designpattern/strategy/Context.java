package com.skey.designpattern.strategy;

/**
 * 上下文 调用具体的策略
 *
 * @author ALion
 * @version 2019/2/17 22:22
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double price) {
        double result = strategy.getPrice(price);
        System.out.println("您门票价格为：" + result + "元");
    }

}
