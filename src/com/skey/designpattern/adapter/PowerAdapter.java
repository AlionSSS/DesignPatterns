package com.skey.designpattern.adapter;

/**
 * 电源适配器
 *
 * @author ALion
 * @version 2019/1/29 22:34
 */
public class PowerAdapter implements Target{

    private PowerOutlet outlet;

    public PowerAdapter(PowerOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public double transport() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return outlet.getElectricity() * 0.5;
    }

}
