package com.skey.designpattern.template;

/**
 * 海鲜餐馆
 *
 * @author ALion
 * @version 2019/2/17 22:58
 */
public class SeafoodRestaurant extends Restaurant {

    @Override
    protected void cook() {
        System.out.println("SeafoodRestaurant.cook 制作海鲜菜品");
    }

}
