package com.skey.designpattern.facade;

/**
 * 重庆税务局
 *
 * @author ALion
 * @version 2019/2/15 23:13
 */
public class ChongqingTaxBureau implements TaxBureau {

    @Override
    public void payTax() {
        System.out.println("ChongqingTaxBureau.payTax 在重庆税务局交税");
    }

}
