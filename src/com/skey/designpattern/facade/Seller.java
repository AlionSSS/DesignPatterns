package com.skey.designpattern.facade;

/**
 * 卖家
 *
 * @author ALion
 * @version 2019/2/15 23:16
 */
public class Seller implements Person {

    @Override
    public void consult() {
        System.out.println("Seller.consult 和卖家协商完房屋价格");
    }

}
