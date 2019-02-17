package com.skey.designpattern.mediator;

/**
 * 部门基类
 *
 * @author ALion
 * @version 2019/2/17 17:11
 */
public abstract class BaseDepartment implements Department {

    protected Mediator mediator;

    public BaseDepartment(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public abstract void selfAction();

    @Override
    public abstract void outAction();

}
