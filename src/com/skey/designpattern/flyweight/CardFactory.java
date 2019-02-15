package com.skey.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 卡牌享元工厂
 *
 * @author ALion
 * @version 2019/2/16 0:46
 */
public class CardFactory {

    private static Map<String, Card> map = new HashMap<>();

    /**
     * 根据key去map取value，如果不存在，就new一个
     * @param shape 卡牌形状
     * @return 卡牌
     */
    public static Card getCard(String shape) {
        // 和下面注释掉的部分等价
        return map.computeIfAbsent(shape, Card::new);
    }

    /*public static Card getCard(String shape) {
        Card card = map.get(shape);
        if (card == null) {
            card = new Card(shape);
            map.put(shape, card);
        }
        return card;
    }*/

}
