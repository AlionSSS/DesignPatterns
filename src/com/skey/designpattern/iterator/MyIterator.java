package com.skey.designpattern.iterator;

/**
 * 迭代器接口
 *
 * @author ALion
 * @version 2019/2/17 15:57
 */
public interface MyIterator {

    /**
     * 将游标指向第一个
     */
    void first();

    /**
     * 判断是否有下一个元素
     */
    boolean hasNext();

    /**
     * 判断是否是第一个元素
     */
    boolean isFirst();

    /**
     * 判断是否是最后一个元素
     */
    boolean isLast();

    /**
     * 获取当前游标指向的对象，将游标向后移
     */
    Object next();

}
