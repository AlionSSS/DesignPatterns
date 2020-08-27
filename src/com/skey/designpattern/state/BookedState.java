package com.skey.designpattern.state;

/**
 * 房间已预定状态
 *
 * @author ALion
 * @version 2019/2/17 23:53
 */
public class BookedState implements State {

    @Override
    public boolean free() {
        System.out.println("BookedState.free: 当前房间已被预订！无法重置为空闲状态!");
        return false;
    }

    @Override
    public boolean book() {
        System.out.println("BookedState.book: 当前房间已被预订！无法再次预订！");
        return false;
    }

    @Override
    public boolean check() {
        System.out.println("BookedState.check: 欢迎入住！");
        return true;
    }

    @Override
    public String toString() {
        return "BookedState{}";
    }
}
