package com.skey.designpattern.facade;

/**
 * 外观模式测试
 *
 * @author ALion
 * @version 2019/2/15 23:21
 */
public class FacadeTest {

    public static void main(String[] args) {
        // 只用关心HouseAgent类，不用管其他类
        HouseAgent houseAgent = new HouseAgent();
        houseAgent.purchaseHouse();
    }

}
