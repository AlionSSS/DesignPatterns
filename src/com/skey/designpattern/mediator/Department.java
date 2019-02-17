package com.skey.designpattern.mediator;

/**
 * 部门接口
 *
 * @author ALion
 * @version 2019/2/17 17:02
 */
public interface Department {

    /**
     * 做自己的事
     */
    void selfAction();

    /**
     * 想总经理发出请求
     */
    void outAction();

}
