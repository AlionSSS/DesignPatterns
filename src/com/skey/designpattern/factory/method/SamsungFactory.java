package com.skey.designpattern.factory.method;

import com.skey.designpattern.factory.Phone;
import com.skey.designpattern.factory.Samsung;

/**
 * 三星手机工厂
 *
 * @author ALion
 * @version 2019/1/26 0:46
 */
public class SamsungFactory implements PhoneFactory {

    @Override
    public Phone create() {
        return new Samsung();
    }

}
