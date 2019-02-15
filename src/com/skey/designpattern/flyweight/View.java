package com.skey.designpattern.flyweight;

/**
 * 卡牌画面 - 外部状态
 *
 * @author ALion
 * @version 2019/2/16 0:41
 */
public class View {

    private String letter;

    public View(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "View{" +
                "letter='" + letter + '\'' +
                '}';
    }
}
