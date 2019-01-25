package com.skey.designpattern.factory.abstractfactory.memory;

/**
 * 低端内存
 *
 * @author ALion
 * @version 2019/1/26 1:15
 */
public class LowMemory implements Memory {

    @Override
    public void capacity() {
        System.out.println("LowMemory.capacity = " + "4G");
    }

    @Override
    public void generation() {
        System.out.println("LowMemory.generation = " + "DDR2");
    }

}
