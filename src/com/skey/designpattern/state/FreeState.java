package com.skey.designpattern.state;

/**
 * 空闲状态
 *
 * @author ALion
 * @version 2019/2/17 23:53
 */
public class FreeState implements State {

    @Override
    public void handle() {
        System.out.println("FreeState.handle 当前房间空闲");
    }

}
