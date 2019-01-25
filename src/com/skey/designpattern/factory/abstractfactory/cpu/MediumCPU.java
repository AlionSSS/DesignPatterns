package com.skey.designpattern.factory.abstractfactory.cpu;

/**
 * 中端CPU
 *
 * @author ALion
 * @version 2019/1/26 1:07
 */
public class MediumCPU implements CPU {

    @Override
    public void frequency() {
        System.out.println("MediumCPU.frequency = " + "2.0GHZ");
    }

    @Override
    public void cores() {
        System.out.println("MediumCPU.cores = " + "4");
    }
}
