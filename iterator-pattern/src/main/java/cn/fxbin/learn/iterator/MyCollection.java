package cn.fxbin.learn.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteCollection
 *
 * 简化版本
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 17:04
 */
public class MyCollection implements ICollection {

    private List list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
