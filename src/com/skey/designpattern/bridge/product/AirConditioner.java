package com.skey.designpattern.bridge.product;

import com.skey.designpattern.bridge.brand.Brand;

/**
 * 空调
 *
 * @author ALion
 * @version 2019/2/13 23:23
 */
public class AirConditioner extends Equipment {

    public AirConditioner(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        System.out.println(brand.name() + " AirConditioner sale");
    }

}
