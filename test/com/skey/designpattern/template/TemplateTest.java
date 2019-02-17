package com.skey.designpattern.template;

/**
 * 模板方法模式测试
 *
 * @author ALion
 * @version 2019/2/17 23:03
 */
public class TemplateTest {

    public static void main(String[] args) {
        Restaurant seafoodRestaurant = new SeafoodRestaurant();
        seafoodRestaurant.haveAMeal();

        Restaurant noodleRestaurant = new NoodleRestaurant();
        noodleRestaurant.haveAMeal();

    }

}
