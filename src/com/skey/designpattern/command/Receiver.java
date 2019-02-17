package com.skey.designpattern.command;

/**
 * 命令执行者
 *
 * @author ALion
 * @version 2019/2/17 17:59
 */
public class Receiver {

    private int id;

    public Receiver(int id) {
        this.id = id;
    }

    public void action() {
        System.out.println("Receiver.action " + id);
    }

}
