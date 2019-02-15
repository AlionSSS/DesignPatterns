package com.skey.designpattern.facade;

/**
 * 商业银行
 *
 * @author ALion
 * @version 2019/2/15 23:11
 */
public class CommercialBank implements Bank {

    @Override
    public void signLoanAgreement() {
        System.out.println("CommercialBank.loan 在商业银行签订贷款协议");
    }

    @Override
    public void payMoney() {
        System.out.println("CommercialBank.payMoney 商业银行放款");
    }

}
