package com.skey.designpattern.state;

/**
 * 房间空闲状态
 *
 * @author ALion
 * @version 2019/2/17 23:53
 */
public class FreeState implements State {

    @Override
    public boolean free() {
        return true;
    }

    @Override
    public boolean book() {
        return true;
    }

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public String toString() {
        return "FreeState{ 空闲 }";
    }
}
