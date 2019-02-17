package com.skey.designpattern.observer;

/**
 * 观察者模式测试
 *
 * @author ALion
 * @version 2019/2/17 23:27
 */
public class ObserverTest {

    public static void main(String[] args) {
        EventEngine engine = new EventEngine();

        engine.register(new MyObserver() {
            @Override
            public void onEvent(Object info) {
                System.out.println("A info = " + info);
            }
        });
        engine.register(new MyObserver() {
            @Override
            public void onEvent(Object info) {
                System.out.println("B info = " + info);
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                engine.post("Hello World!");
            }
        }).start();

    }

}
