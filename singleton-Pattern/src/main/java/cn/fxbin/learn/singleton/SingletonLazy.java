package cn.fxbin.learn.singleton;

/**
 * SingletonLazy  懒汉式
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/2 11:20
 */
public class SingletonLazy {

//    private static SingletonLazy instance;

    public SingletonLazy() {
    }

    /**
     * 单例对象的方法
     */
    public void process() {
        System.out.println("方法调用成功");
    }

    /**
     * getInstance
     *
     * <p>
     *     第一种方式，对外暴露一个方法获取类的对象
     *
     *     线程不安全，多线程下存在安全问题
     * </p>
     *
     * @author fxbin
     * @since 2021/2/2 11:24
     * @return cn.fxbin.learn.singleton.SingletonLazy
     */
//    public static SingletonLazy getInstance() {
//        if (instance == null) {
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }


    /**
     * getInstance
     *
     * <p>
     *     通过加锁 synchronized 保证单例
     *
     *     采用 synchronized 对方法加锁有很大的性能开销
     *
     *     解决方法： 锁的粒度减小
     *
     * </p>
     *
     * @author fxbin
     * @since 2021/2/2 11:26
     * @return cn.fxbin.learn.singleton.SingletonLazy
     */
//    public static synchronized SingletonLazy getInstance() {
//        if (instance == null) {
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }


    /**
     * getInstance
     *
     * <p>
     *     第三种实现
     *
     *     DCL 双重检查锁定 （Double-Checked-Locking）,在多线程情况下保持高性能
     *
     *     是否安全？ instance = new SingletonLazy(); 并不是原子性操作
     *          1. 分配空间给对象
     *          2. 在空间内创建对象
     *          3. 将对象赋值给引用 instance
     *
     *      假如线程 1-》3-》2 顺序，会把值写回主内存，其它线程就会读取到 instance 最新的值，但是这是不完全对象
     * </p>
     * @author fxbin
     * @since 2021/2/2 11:31
     * @return cn.fxbin.learn.singleton.SingletonLazy
     */
//    public static SingletonLazy getInstance() {
//        if (instance == null) {
//            // A、B
//            synchronized (SingletonLazy.class) {
//                if (instance == null) {
//                    instance = new SingletonLazy();
//                }
//            }
//        }
//        return instance;
//    }

    private static SingletonLazy instance;

    /**
     * getInstance
     *
     * <p>
     *     volatile 是java提供的关键词，可以禁止指令重排
     *
     *     指令重排序是JVM对语句执行的优化，只要语句间没有依赖，那JVM就有权对语句进行优化
     *
     *     禁止了指令重排
     * </p>
     *
     * @author fxbin
     * @since 2021/2/2 11:43
     * @return cn.fxbin.learn.singleton.SingletonLazy
     */
    public static SingletonLazy getInstance() {
        if (instance == null) {
            // A、B 锁定
            synchronized (SingletonLazy.class) {
                //第二重检查
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
