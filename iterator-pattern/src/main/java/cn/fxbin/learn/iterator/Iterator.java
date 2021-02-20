package cn.fxbin.learn.iterator;

/**
 * iterator
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 16:50
 */
public interface Iterator {

    /**
     * 获取下一个元素
     * @return Object
     */
    Object next();

    /**
     * 获取下一个元素
     * @return boolean
     */
    boolean hasNext();

    /**
     * 删除元素
     * @return Object
     */
    Object remove(Object obj);



}
