package com.skey.designpattern.factory.abstractfactory;

import com.skey.designpattern.factory.abstractfactory.cpu.CPU;
import com.skey.designpattern.factory.abstractfactory.cpu.HighCPU;
import com.skey.designpattern.factory.abstractfactory.cpu.LowCPU;
import com.skey.designpattern.factory.abstractfactory.memory.HighMemory;
import com.skey.designpattern.factory.abstractfactory.memory.LowMemory;
import com.skey.designpattern.factory.abstractfactory.memory.Memory;
import com.skey.designpattern.factory.abstractfactory.screen.HighScreen;
import com.skey.designpattern.factory.abstractfactory.screen.LowScreen;
import com.skey.designpattern.factory.abstractfactory.screen.Screen;

/**
 * 坏手机的工厂
 *
 * @author ALion
 * @version 2019/1/26 1:31
 */
public class BadPhoneFactory implements PhoneFactory {

    @Override
    public CPU createCPU() {
        return new LowCPU();
    }

    @Override
    public Memory createMemory() {
        return new LowMemory();
    }

    @Override
    public Screen createScreen() {
        return new LowScreen();
    }

}
