package com.skey.designpattern.factory.abstractfactory.memory;

/**
 * 中端内存
 *
 * @author ALion
 * @version 2019/1/26 1:15
 */
public class MediumMemory implements Memory {

    @Override
    public void capacity() {
        System.out.println("MediumMemory.capacity = " + "8G");
    }

    @Override
    public void generation() {
        System.out.println("MediumMemory.generation = " + "DDR3");
    }

}
