package com.skey.designpattern.proxy;

import com.skey.designpattern.proxy.dynamicproxy.WorkHandler;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 *
 * @author ALion
 * @version 2019/1/30 21:44
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        Singer singer = new Singer();

        WorkHandler handler = new WorkHandler(singer);
        Work proxy = (Work) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{Work.class},
                handler);
        proxy.sing();
    }

}
