package com.skey.designpattern.chian;

/**
 * 领导的抽象类
 *
 * @author ALion
 * @version 2019/2/17 15:10
 */
public abstract class Leader {

    /**
     * 人名
     */
    protected String name;

    /**
     * 责任链的下一个对象
     */
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理休假请求
     * @param leaveRequest 休假请求
     */
    public abstract void handleRequest(LeaveRequest leaveRequest);

}
