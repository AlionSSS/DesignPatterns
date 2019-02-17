package com.skey.designpattern.strategy;

/**
 * 针对婴儿的价格策略
 *
 * @author ALion
 * @version 2019/2/17 22:19
 */
public class BabyStrategy implements Strategy {

    @Override
    public double getPrice(double originalPrice) {
        return 0;
    }

}
