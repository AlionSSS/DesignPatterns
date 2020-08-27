package com.skey.designpattern.state;

/**
 * 房间已入住状态
 *
 * @author ALion
 * @version 2019/2/17 23:53
 */
public class CheckedState implements State {

    @Override
    public boolean free() {
        System.out.println("CheckedState.free: 当前房间已被入住！无法重置为空闲状态!");
        return false;
    }

    @Override
    public boolean book() {
        System.out.println("CheckedState.book: 当前房间已被入住！无法预订！");
        return false;
    }

    @Override
    public boolean check() {
        System.out.println("CheckedState.check: 当前房间已被入住！无法再次入住！");
        return false;
    }

    @Override
    public String toString() {
        return "CheckedState{}";
    }

}
