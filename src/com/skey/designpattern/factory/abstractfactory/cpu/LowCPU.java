package com.skey.designpattern.factory.abstractfactory.cpu;

/**
 * 低端CPU
 *
 * @author ALion
 * @version 2019/1/26 1:07
 */
public class LowCPU implements CPU {

    @Override
    public void frequency() {
        System.out.println("LowCPU.frequency = " + "1.0GHZ");
    }

    @Override
    public void cores() {
        System.out.println("LowCPU.cores = " + "1");
    }

}
