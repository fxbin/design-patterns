package cn.fxbin.learn.observer;

/**
 * BossConcreteSubject
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 14:54
 */
public class BossConcreteSubject extends Subject {

    public void doSomething() {
        System.out.println("Boss balalala...");

        // ...

        System.out.println("视察工作情况");

        this.notifyAllObserver();
    }

}
