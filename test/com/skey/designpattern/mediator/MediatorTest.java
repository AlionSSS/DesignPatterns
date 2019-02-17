package com.skey.designpattern.mediator;

/**
 * 中介者模式测试
 *
 * @author ALion
 * @version 2019/2/17 17:22
 */
public class MediatorTest {

    public static void main(String[] args) {
        President president = new President();

        Department development = new Development(president);
        Department market = new Market(president);
        Department financial = new Financial(president);

        president.register("development", development);
        president.register("market", market);
        president.register("financial", financial);

        development.selfAction();
        development.outAction();

        market.selfAction();
        market.outAction();
    }

}
