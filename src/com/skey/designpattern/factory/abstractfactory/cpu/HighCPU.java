package com.skey.designpattern.factory.abstractfactory.cpu;

/**
 * 高端CPU
 *
 * @author ALion
 * @version 2019/1/26 1:07
 */
public class HighCPU implements CPU {

    @Override
    public void frequency() {
        System.out.println("HighCPU.frequency = " + "3.0GHZ");
    }

    @Override
    public void cores() {
        System.out.println("HighCPU.cores = " + "8");
    }
}