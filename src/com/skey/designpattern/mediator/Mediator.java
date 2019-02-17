package com.skey.designpattern.mediator;

/**
 * 中介接口
 *
 * @author ALion
 * @version 2019/2/17 17:01
 */
public interface Mediator {

    /**
     * 注册到中介
     * @param name 部门名称
     * @param department 部门类
     */
    void register(String name, Department department);

    /**
     * 让具体的部门执行本部门的职能
     * @param name 部门名称
     */
    void command(String name);

}
