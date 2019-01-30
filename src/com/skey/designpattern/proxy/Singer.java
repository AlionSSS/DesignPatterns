package com.skey.designpattern.proxy;

/**
 * 歌手
 * <p>
 *     歌手主要是唱歌，其他交给经纪人来代理
 * </p>
 *
 * @author ALion
 * @version 2019/1/30 21:15
 */
public class Singer implements Work {

    @Override
    public void confer() {
        System.out.println("Singer.confer: 歌手商议");
    }

    public void signContract() {
        System.out.println("Singer.signContract: 歌手签合同");
    }

    @Override
    public void sing() {
        System.out.println("Singer.sing: 歌手唱歌");
    }

    @Override
    public void collectMoney() {
        System.out.println("Singer.collectMoney: 歌手收钱");
    }

}
