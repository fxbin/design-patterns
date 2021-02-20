package cn.fxbin.learn.observer;

/**
 * LWConcreteObserver
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 14:55
 */
public class LWConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("老王发现boss, 停止摸鱼，努力工作...");
    }
}
