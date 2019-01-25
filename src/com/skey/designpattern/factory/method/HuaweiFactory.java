package com.skey.designpattern.factory.method;

import com.skey.designpattern.factory.Huawei;
import com.skey.designpattern.factory.Phone;

/**
 * 华为手机工厂
 *
 * @author ALion
 * @version 2019/1/26 0:46
 */
public class HuaweiFactory implements PhoneFactory {

    @Override
    public Phone create() {
        return new Huawei();
    }

}
