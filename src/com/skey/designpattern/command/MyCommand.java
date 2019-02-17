package com.skey.designpattern.command;

/**
 * 命令实现类
 *
 * @author ALion
 * @version 2019/2/17 18:00
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 在真正的命令执行前后做做一些其他处理
        System.out.println("receiver.action() before");
        receiver.action();
        System.out.println("receiver.action() after");
    }

}
