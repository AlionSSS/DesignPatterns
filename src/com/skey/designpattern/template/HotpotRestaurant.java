package com.skey.designpattern.template;

/**
 * 火锅餐馆
 *
 * @author ALion
 * @version 2019/2/17 22:58
 */
public class HotpotRestaurant extends Restaurant {

    @Override
    protected void cook() {
        System.out.println("SeafoodRestaurant.cook 制作火锅");
    }

}
