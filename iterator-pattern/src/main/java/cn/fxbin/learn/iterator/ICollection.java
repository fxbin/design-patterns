package cn.fxbin.learn.iterator;

/**
 * ICollection
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 17:03
 */
public interface ICollection {

    void add(Object obj);

    void remove(Object obj);

    Iterator iterator();

}
