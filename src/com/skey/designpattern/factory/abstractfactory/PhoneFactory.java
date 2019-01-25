package com.skey.designpattern.factory.abstractfactory;

import com.skey.designpattern.factory.abstractfactory.cpu.CPU;
import com.skey.designpattern.factory.abstractfactory.memory.Memory;
import com.skey.designpattern.factory.abstractfactory.screen.Screen;

/**
 * 手机工厂
 *
 * @author ALion
 * @version 2019/1/26 1:29
 */
public interface PhoneFactory {

    CPU createCPU();

    Memory createMemory();

    Screen createScreen();

}
