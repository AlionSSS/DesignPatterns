package com.skey.designpattern.template;

/**
 * 模板 - 餐馆抽象类
 *
 * @author ALion
 * @version 2019/2/17 22:51
 */
public abstract class Restaurant {

    /**
     * 点餐
     */
    private void orderDishes() {
        System.out.println("Restaurant.orderDishes 点餐");
    }

    /**
     * 做菜
     */
    protected abstract void cook();

    /**
     * 付款
     */
    private void payMoney() {
        System.out.println("Restaurant.payMoney 收钱");
    }

    /**
     * 吃饭
     */
    public void haveAMeal() {
        orderDishes();
        cook();
        payMoney();
    }

}
