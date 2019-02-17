package com.skey.designpattern.chian;

/**
 * 责任链第一个对象 - 总经理
 *
 * @author ALion
 * @version 2019/2/17 15:13
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 30) {
            System.out.println(this.name + "总经理批准了" + leaveRequest.getName() + "的休假！");
        } else {
            System.out.println("请假时间过长，不予通过！");
        }
    }

}
