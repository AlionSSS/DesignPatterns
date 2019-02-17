package com.skey.designpattern.state;

/**
 * 已入住状态
 *
 * @author ALion
 * @version 2019/2/17 23:53
 */
public class CheckedState implements State {

    @Override
    public void handle() {
        System.out.println("CheckedState.handle 当前房间入住");
    }

}
