package com.skey.designpattern.bridge.product;

import com.skey.designpattern.bridge.brand.Brand;

/**
 * 电风扇
 *
 * @author ALion
 * @version 2019/2/13 23:33
 */
public class ElectricFan extends Equipment {

    public ElectricFan(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println(brand.name() + " ElectricFan sale");
    }

}
