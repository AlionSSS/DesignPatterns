package com.skey.designpattern.iterator;

/**
 * 迭代器模式测试
 *
 * @author ALion
 * @version 2019/2/17 16:12
 */
public class IteratorTest {

    public static void main(String[] args) {
        ProductAggregate aggregate = new ProductAggregate();
        aggregate.add("java");
        aggregate.add("python");
        aggregate.add("scala");
        aggregate.add("golang");

        MyIterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

}
