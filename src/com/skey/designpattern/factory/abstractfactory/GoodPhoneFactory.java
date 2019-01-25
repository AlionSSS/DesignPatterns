package com.skey.designpattern.factory.abstractfactory;

import com.skey.designpattern.factory.abstractfactory.cpu.CPU;
import com.skey.designpattern.factory.abstractfactory.cpu.HighCPU;
import com.skey.designpattern.factory.abstractfactory.memory.HighMemory;
import com.skey.designpattern.factory.abstractfactory.memory.Memory;
import com.skey.designpattern.factory.abstractfactory.screen.HighScreen;
import com.skey.designpattern.factory.abstractfactory.screen.Screen;

/**
 * 好手机的工厂
 *
 * @author ALion
 * @version 2019/1/26 1:31
 */
public class GoodPhoneFactory implements PhoneFactory {

    @Override
    public CPU createCPU() {
        return new HighCPU();
    }

    @Override
    public Memory createMemory() {
        return new HighMemory();
    }

    @Override
    public Screen createScreen() {
        return new HighScreen();
    }

}
