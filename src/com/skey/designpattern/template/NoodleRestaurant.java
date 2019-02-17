package com.skey.designpattern.template;

/**
 * 面食餐馆
 *
 * @author ALion
 * @version 2019/2/17 22:57
 */
public class NoodleRestaurant extends Restaurant {

    @Override
    protected void cook() {
        System.out.println("NoodleRestaurant.cook 制作面食");
    }

}
