package com.skey.designpattern.singleton;

/**
 * 单例-枚举（推荐）
 * <p>
 *     优点：简洁、安全、高效、直接能避免反射和反序列化的漏洞
 * </p>
 * @author ALion
 * @version 2019/1/25 21:40
 */
public enum SingletonDemo04 {

    // 直接调用SingletonDemo04.INSTANCE即可
    INSTANCE;

    // 定义对象的属性、方法

}
