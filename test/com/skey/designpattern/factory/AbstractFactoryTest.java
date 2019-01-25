package com.skey.designpattern.factory;

import com.skey.designpattern.factory.abstractfactory.BadPhoneFactory;
import com.skey.designpattern.factory.abstractfactory.GoodPhoneFactory;
import com.skey.designpattern.factory.abstractfactory.PhoneFactory;
import com.skey.designpattern.factory.abstractfactory.cpu.CPU;
import com.skey.designpattern.factory.abstractfactory.memory.Memory;
import com.skey.designpattern.factory.abstractfactory.screen.Screen;

/**
 * 抽象工厂测试
 *
 * @author ALion
 * @version 2019/1/26 1:34
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        // 测试生产好手机
        goodPhone();

        // 测试生产坏手机
        badPhone();
    }

    public static void goodPhone() {
        System.out.println("AbstractFactoryTest.goodPhone ---> 好手机");
        PhoneFactory factory = new GoodPhoneFactory();

        show(factory);
    }

    public static void badPhone() {
        System.out.println("AbstractFactoryTest.badPhone ---> 坏手机");
        PhoneFactory factory = new BadPhoneFactory();

        show(factory);
    }

    public static void show(PhoneFactory factory) {
        CPU cpu = factory.createCPU();
        cpu.frequency();
        cpu.cores();

        Memory memory = factory.createMemory();
        memory.capacity();
        memory.generation();

        Screen screen = factory.createScreen();
        screen.resolution();
        screen.color();
    }

}
