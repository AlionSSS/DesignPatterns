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
        return false;
    }

    @Override
    public boolean book() {
        return false;
    }

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public String toString() {
        return "CheckedState{ 已被入住 }";
    }

}
