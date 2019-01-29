package com.skey.designpattern.adapter;

/**
 * 笔记本电脑
 *
 * @author ALion
 * @version 2019/1/29 22:31
 */
public class Laptop {

    /** 电流 */
    private double electricity;

    /**
     * 充电
     * @param target 适配器
     */
    public void charge(Target target) {
        System.out.println("开始充电");
        while (electricity < 100) {
            electricity += target.transport();
            System.out.println("电量已有 " + electricity);
        }
        System.out.println("充电完成");
    }

}
