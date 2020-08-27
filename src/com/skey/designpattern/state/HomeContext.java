package com.skey.designpattern.state;

/**
 * 房间上下文 状态处理
 *
 * @author ALion
 * @version 2019/2/17 23:55
 */
public class HomeContext {

    private static final FreeState freeState = new FreeState();
    private static final BookedState bookedState = new BookedState();
    private static final CheckedState checkedState = new CheckedState();

    private State state;

    public HomeContext() {
        this.state = new FreeState();
    }

    public State getState() {
        return state;
    }

    /**
     * 清空房间
     */
    public void free() {
        if (state.free()) {
            state = freeState;
            System.out.println("HomeContext.free: 房间已被清空！");
        } else {
            System.out.println("HomeContext.free: 房间清空失败！");
        }
        printState();
    }

    /**
     * 预订该房间
     */
    public void book() {
        if (state.book()) {
            state = bookedState;
            System.out.println("HomeContext.book: 房间预订成功！");
        } else {
            System.out.println("HomeContext.book: 房间预订失败！");
        }
        printState();
    }

    /**
     * 入住该房间
     */
    public void check() {
        if (state.check()) {
            state = checkedState;
            System.out.println("HomeContext.check: 入住房间成功！");
        } else {
            System.out.println("HomeContext.check: 入住房间失败！");
        }
        printState();
    }

    private void printState() {
        System.out.println(">>>>>>> 当前房间状态: " + state);
    }

}
