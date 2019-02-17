package com.skey.designpattern.mediator;

/**
 * 研发部
 *
 * @author ALion
 * @version 2019/2/17 17:06
 */
public class Development extends BaseDepartment {

    public Development(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void selfAction() {
        System.out.println("Development.selfAction 研发产品");
    }

    @Override
    public void outAction() {
        System.out.println("Development.outAction 没钱了，需要支援");
        mediator.command("financial");
    }

}
