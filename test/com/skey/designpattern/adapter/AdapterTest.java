package com.skey.designpattern.adapter;

/**
 * 适配器模式测试
 *
 * @author ALion
 * @version 2019/1/29 22:30
 */
public class AdapterTest {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        PowerOutlet outlet = new PowerOutlet();
        PowerAdapter adapter = new PowerAdapter(outlet);
        laptop.charge(adapter);
    }

}
