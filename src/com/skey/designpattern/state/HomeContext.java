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

    public void free() {
        if (state.free()) {
            state = freeState;
        }
    }

    public void book() {
        if (state.book()) {
            state = bookedState;
        }
    }

    public void check() {
        if (state.check()) {
            state = checkedState;
        }
    }

}
