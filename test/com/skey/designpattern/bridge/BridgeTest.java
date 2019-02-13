package com.skey.designpattern.bridge;

import com.skey.designpattern.bridge.brand.Gree;
import com.skey.designpattern.bridge.brand.Media;
import com.skey.designpattern.bridge.product.AirConditioner;
import com.skey.designpattern.bridge.product.ElectricFan;
import com.skey.designpattern.bridge.product.Equipment;

/**
 * 桥接模式测试
 *
 * @author ALion
 * @version 2019/2/13 23:27
 */
public class BridgeTest {

    public static void main(String[] args) {
        Equipment equipment = new AirConditioner(new Gree());
        equipment.sale();

        Equipment equipment2 = new ElectricFan(new Media());
        equipment2.sale();

    }

}
