package com.skey.designpattern.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * 事件驱动引擎
 *
 * @author ALion
 * @version 2019/2/17 23:20
 */
public class EventEngine {

    /**
     * 观察者集合
     */
    private Set<MyObserver> observers = new HashSet<>();

    /**
     * 注册观察者
     * @param observer 观察者
     */
    public void register(MyObserver observer) {
        observers.add(observer);
    }

    /**
     * 注销观察者
     * @param observer 观察者
     */
    public void unregister(MyObserver observer) {
        observers.remove(observer);
    }

    /**
     * 发送通知
     * @param info 信息
     */
    public void post(Object info) {
        // 遍历观察者集合，通知每个观察者
        for (MyObserver observer : observers) {
            observer.onEvent(info);
        }
    }

}
