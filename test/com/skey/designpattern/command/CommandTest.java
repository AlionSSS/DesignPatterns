package com.skey.designpattern.command;

/**
 * 命令模式测试
 *
 * @author ALion
 * @version 2019/2/17 18:06
 */
public class CommandTest {

    public static void main(String[] args) {
        Command command1 = new MyCommand(new Receiver(1));
        Command command2 = new MyCommand(new Receiver(2));

        Invoke invoke = new Invoke();
        invoke.add(command1);
        invoke.add(command2);

        invoke.run();
    }

}
