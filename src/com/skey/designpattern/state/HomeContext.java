package com.skey.designpattern.state;

/**
 * 房间上下文 状态处理
 *
 * @author ALion
 * @version 2019/2/17 23:55
 */
public class HomeContext {

    private State state;

    public void setState(State state) {
        System.out.println("HomeContext.setState 房间状态改变");
        this.state = state;
        state.handle();
    }

}
