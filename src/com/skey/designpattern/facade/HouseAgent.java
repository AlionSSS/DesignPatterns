package com.skey.designpattern.facade;

/**
 * 房地产经纪人
 *
 * @author ALion
 * @version 2019/2/15 23:23
 */
public class HouseAgent {

    public void purchaseHouse() {
        findGoodHouse();

        Seller seller = new Seller();
        seller.consult();

        CommercialBank commercialBank = new CommercialBank();
        commercialBank.signLoanAgreement();

        ChongqingTaxBureau chongqingTaxBureau = new ChongqingTaxBureau();
        chongqingTaxBureau.payTax();

        commercialBank.payMoney();

        over();
    }

    private void findGoodHouse() {
        System.out.println("HouseAgent.findGoodHouse 房产经纪人寻找到合适的房屋");
    }

    private void over() {
        System.out.println("HouseAgent.over 本次购房完成");
    }

}
