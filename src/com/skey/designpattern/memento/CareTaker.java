package com.skey.designpattern.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * 视频备份维护的负责人
 *
 * @author ALion
 * @version 2019/2/18 0:27
 */
public class CareTaker {

    private Map<String, VideoMemento> map = new HashMap<>();

    public void setMemento(String key, VideoMemento memento) {
        map.put(key, memento);
    }

    public VideoMemento getMemento(String key) {
        return map.get(key);
    }

}
