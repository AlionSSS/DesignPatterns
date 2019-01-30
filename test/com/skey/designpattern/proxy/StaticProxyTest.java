package com.skey.designpattern.proxy;

import com.skey.designpattern.proxy.staticproxy.Agent;

/**
 * 静态代理测试
 *
 * @author ALion
 * @version 2019/1/30 21:26
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Singer singer = new Singer();
        Work work = new Agent(singer);
        work.confer();
        work.signContract();
        work.sing();
        work.collectMoney();
    }

}
