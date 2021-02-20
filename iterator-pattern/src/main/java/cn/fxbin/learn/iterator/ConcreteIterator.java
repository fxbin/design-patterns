package cn.fxbin.learn.iterator;

import java.util.List;

/**
 * ConcreteIterator
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 16:59
 */
public class ConcreteIterator implements Iterator {

    private List list;

    private int index = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(index);
            index++;
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index == list.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object remove(Object obj) {
        return list.remove(obj);
    }


}
