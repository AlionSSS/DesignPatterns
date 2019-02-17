package com.skey.designpattern.chain;

import com.skey.designpattern.chian.*;

/**
 * 责任链模式测试
 *
 * @author ALion
 * @version 2019/2/17 15:19
 */
public class ChainTest {

    public static void main(String[] args) {
        // 建立责任对象
        Leader bill = new Director("Bill");
        Leader lily = new Manager("Lily");
        Leader white = new GeneralManager("White");

        // 连接责任链
        bill.setNextLeader(lily);
        lily.setNextLeader(white);

        // 构建休假请求
        LeaveRequest leaveRequest = new LeaveRequest("小王", 5, "亲戚结婚，需要参加！");
        System.out.println(leaveRequest);

        // 开始处理请求
        bill.handleRequest(leaveRequest);
    }

}
