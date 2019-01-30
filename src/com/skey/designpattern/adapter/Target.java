package com.skey.designpattern.adapter;

/**
 * 电源接口
 *
 * @author ALion
 * @version 2019/1/29 22:45
 */
public interface Target {

    /**
     * 电流传输转换
     * @return 电流
     */
    double transport();

}
