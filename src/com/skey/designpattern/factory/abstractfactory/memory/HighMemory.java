package com.skey.designpattern.factory.abstractfactory.memory;

/**
 * 高端内存
 *
 * @author ALion
 * @version 2019/1/26 1:15
 */
public class HighMemory implements Memory {

    @Override
    public void capacity() {
        System.out.println("HighMemory.capacity = " + "16G");
    }

    @Override
    public void generation() {
        System.out.println("HighMemory.generation = " + "DDR4");
    }

}
