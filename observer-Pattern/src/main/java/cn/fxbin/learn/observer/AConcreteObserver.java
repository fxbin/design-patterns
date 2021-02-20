package cn.fxbin.learn.observer;

/**
 * AConcreteObserver
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 14:56
 */
public class AConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("小A, 停止吹水");
    }
}
