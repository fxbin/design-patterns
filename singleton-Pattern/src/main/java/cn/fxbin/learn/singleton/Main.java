package cn.fxbin.learn.singleton;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/2 11:27
 */
public class Main {

    public static void main(String[] args) {
//        SingletonLazy.getInstance().process();
        SingletonHungry.getInstance().process();
    }

}
