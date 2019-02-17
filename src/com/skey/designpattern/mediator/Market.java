package com.skey.designpattern.mediator;

/**
 * 市场部
 *
 * @author ALion
 * @version 2019/2/17 17:10
 */
public class Market extends BaseDepartment {

    public Market(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void selfAction() {
        System.out.println("Market.selfAction 拓展市场项目");
    }

    @Override
    public void outAction() {
        System.out.println("Market.outAction 没钱了，需要支援");
        mediator.command("financial");
    }

}
