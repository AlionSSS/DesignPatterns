package com.skey.designpattern.state;

/**
 * 房间已预定状态
 *
 * @author ALion
 * @version 2019/2/17 23:53
 */
public class BookedState implements State {

    @Override
    public void handle() {
        System.out.println("BookedState.handle 当前房间已被预订");
    }

}
