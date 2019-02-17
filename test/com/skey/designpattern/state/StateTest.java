package com.skey.designpattern.state;

/**
 * 状态模式测试
 *
 * @author ALion
 * @version 2019/2/17 23:57
 */
public class StateTest {

    public static void main(String[] args) {
        HomeContext context = new HomeContext();

        State freeState = new FreeState();
        context.setState(freeState);

        State bookedState = new BookedState();
        context.setState(bookedState);

        State checkedState = new CheckedState();
        context.setState(checkedState);
    }

}
