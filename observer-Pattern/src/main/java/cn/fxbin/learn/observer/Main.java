package cn.fxbin.learn.observer;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 14:57
 */
public class Main {

    public static void main(String[] args) {
        // 创建主题 boss
        BossConcreteSubject boss = new BossConcreteSubject();

        // 创建观察者
        Observer lw = new LWConcreteObserver();
        Observer a = new AConcreteObserver();

        // 建立关系，主题 + 观察者
        boss.addObserver(lw);
        boss.addObserver(a);

        // 主题开始活动，通知观察者，（发布消息）
        boss.doSomething();
    }

}
