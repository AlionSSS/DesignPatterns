package com.skey.designpattern.factory.method;

import com.skey.designpattern.factory.Phone;

/**
 * 手机工厂
 *
 * @author ALion
 * @version 2019/1/26 0:44
 */
public interface PhoneFactory {

    /**
     * 创建手机对象
     * @return 手机对象
     */
    Phone create();

}
