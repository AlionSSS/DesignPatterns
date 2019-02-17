package com.skey.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的商品聚合类
 *
 * @author ALion
 * @version 2019/2/17 16:00
 */
public class ProductAggregate {

    private List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public MyIterator iterator() {
        return new ProductIterator();
    }

    /**
     * 商品迭代器
     */
    private class ProductIterator implements MyIterator {

        /**
         * 游标
         */
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size() - 1;
        }

        @Override
        public Object next() {
            Object obj = list.get(cursor);
            cursor++;
            return obj;
        }

    }

}
