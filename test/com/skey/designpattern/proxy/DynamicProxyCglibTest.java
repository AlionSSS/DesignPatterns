package com.skey.designpattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 动态代理测试
 *
 * @author ALion
 * @version 2019/1/30 21:44
 */
public class DynamicProxyCglibTest {

    public static void main(String[] args) {
        /*
        <!-- cglib的maven依赖 pom.xml -->
        <dependency>
            <groupId>cglib</groupId>
            <artifactId>cglib</artifactId>
            <version>2.2.2</version>
        </dependency>
         */

        // Singer是否实现接口无所谓
        Singer singer = new Singer();

        Singer proxySinger = (Singer) Enhancer.create(Singer.class, new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object obj = null;
                if ("sing".equals(method.getName())) {
                    System.out.println("Enhancer.invoke: 代理商议");
                    System.out.println("Enhancer.invoke: 代理签合同");
                    // 唱歌时，让歌手去做
                    obj = method.invoke(singer, args);
                    System.out.println("Enhancer.invoke: 代理收钱");
                }

                return obj;
            }
        });

        proxySinger.sing();
    }

}
