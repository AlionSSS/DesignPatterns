package com.skey.designpattern.mediator;

/**
 * 财务部
 *
 * @author ALion
 * @version 2019/2/17 17:08
 */
public class Financial extends BaseDepartment {

    public Financial(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void selfAction() {
        System.out.println("Financial.selfAction 统计财务情况，发钱");
    }

    @Override
    public void outAction() {
        System.out.println("Financial.outAction");
    }

}
