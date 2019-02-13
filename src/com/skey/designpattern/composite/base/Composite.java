package com.skey.designpattern.composite.base;

/**
 * 容器节点
 *
 * @author ALion
 * @version 2019/2/14 0:21
 */
public interface Composite extends Component {

    void add(Component component);

    void remove(Component component);

    Component getChild(int index);

}
