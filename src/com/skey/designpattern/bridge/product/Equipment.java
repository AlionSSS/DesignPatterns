package com.skey.designpattern.bridge.product;

import com.skey.designpattern.bridge.brand.Brand;

/**
 * 设备类
 * <p>
 *     此处桥接Brand
 * </p>
 * @author ALion
 * @version 2019/2/13 23:18
 */
public abstract class Equipment {

    protected Brand brand;

    public Equipment(Brand brand) {
        this.brand = brand;
    }

    public abstract void sale();

}
