package com.skey.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用者
 *
 * @author ALion
 * @version 2019/2/17 18:02
 */
public class Invoke {

    // 可能存在多个命令
    private List<Command> list = new ArrayList<>();

    public void add(Command command) {
        list.add(command);
    }

    /**
     * 实际业务，同于调用命令
     */
    public void run() {
        for (Command command : list) {
            command.execute();
        }
    }

}
