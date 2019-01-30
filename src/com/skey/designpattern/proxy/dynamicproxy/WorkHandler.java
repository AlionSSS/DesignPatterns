package com.skey.designpattern.proxy.dynamicproxy;

import com.skey.designpattern.proxy.Work;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 功能处理
 *
 * @author ALion
 * @version 2019/1/30 21:42
 */
public class WorkHandler implements InvocationHandler {

    private Work work;

    /**
     * 构造器
     *
     * @param work 歌手
     */
    public WorkHandler(Work work) {
        this.work = work;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        // AOP编程就是在此处实现对调用某个方法的前后调用其他方法
        if ("sing".equals(method.getName())) {
            System.out.println("WorkHandler.invoke: 代理商议");
            System.out.println("WorkHandler.invoke: 代理签合同");
            // 唱歌时，让歌手去做
            obj = method.invoke(work, args);
            System.out.println("WorkHandler.invoke: 代理收钱");
        }

        return obj;
    }

}
