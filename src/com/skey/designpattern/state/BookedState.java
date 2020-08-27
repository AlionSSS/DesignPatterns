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
        return false;
    }

    @Override
    public boolean book() {
        return false;
    }

    @Override
    public boolean check() {
        return true;
    }

    @Override
    public String toString() {
        return "BookedState{ 已被预订 }";
    }
}
