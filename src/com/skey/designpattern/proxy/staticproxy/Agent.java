package com.skey.designpattern.proxy.staticproxy;

import com.skey.designpattern.proxy.Work;

/**
 * 经纪人
 * <p>
 *     经纪人负责来代理商议、签合同、收钱，唱歌交给歌手
 * </p>
 *
 * @author ALion
 * @version 2019/1/30 21:16
 */
public class Agent implements Work {

    private Work work;

    /**
     * 构造器
     * @param work 歌手
     */
    public Agent(Work work) {
        this.work = work;
    }

    @Override
    public void confer() {
        System.out.println("Agent.confer: 经纪人商议");
    }

    @Override
    public void signContract() {
        System.out.println("Agent.signContract: 经纪人签合同");
    }

    @Override
    public void sing() {
        // 可以在唱歌前后再做些操作
        // 唱歌交给歌手自己来
        work.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("Agent.collectMoney: 经纪人收钱");
    }
}
