package com.skey.designpattern.state;

/**
 * 状态模式测试
 *
 * @author ALion
 * @version 2019/2/17 23:57
 */
public class StateTest {

    public static void main(String[] args) {
        // 状态模式，只需要管外部操作即可，内部会自动切换状态

        HomeContext context = new HomeContext();
        // 初始是空闲状态
        System.out.println(context.getState());

        // 来人预订房间
        context.book();
        // 再来一个人预订房间
        context.book();

        // 入住房间
        context.check();
        // 再来一个人预订房间
        context.check();
        // 再来一个人入住房间
        context.book();
    }

}
