package com.skey.designpattern.chian;

/**
 * 责任链第一个对象 - 经理
 *
 * @author ALion
 * @version 2019/2/17 15:13
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= 10) {
            System.out.println(this.name + "经理批准了" + leaveRequest.getName() + "的休假！");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }

}
