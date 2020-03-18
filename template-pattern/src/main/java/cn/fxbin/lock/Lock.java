package cn.fxbin.lock;

/**
 * Lock
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:08
 */
public interface Lock {

    // 获取锁
    void getLock();

    // 释放锁
    void unLock();

}
