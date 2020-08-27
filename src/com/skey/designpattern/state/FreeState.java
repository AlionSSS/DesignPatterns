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
        System.out.println("FreeState.free: 当前房间空闲！");
        return true;
    }

    @Override
    public boolean book() {
        System.out.println("FreeState.book: 当前房间空闲！感谢预订！");
        return true;
    }

    @Override
    public boolean check() {
        System.out.println("FreeState.check: 当前房间尚未预订！请先预订！");
        return false;
    }

    @Override
    public String toString() {
        return "FreeState{}";
    }
}
