package com.skey.designpattern.bridge.product;

import com.skey.designpattern.bridge.brand.Brand;

/**
 * 冰箱
 *
 * @author ALion
 * @version 2019/2/13 23:25
 */
public class Fridge extends Equipment {

    public Fridge(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println(brand.name() + " Fridge sale");
    }

}
