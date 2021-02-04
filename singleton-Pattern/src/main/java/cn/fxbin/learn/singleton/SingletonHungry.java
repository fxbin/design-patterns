package cn.fxbin.learn.singleton;

/**
 * SingletonHungry
 *
 * <p>
 *     单例 -- 饿汉
 *
 *
 * </p>
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/2 14:41
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    public SingletonHungry() {
    }

    /**
     * 单例对象的方法
     */
    public void process() {
        System.out.println("方法调用成功");
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
