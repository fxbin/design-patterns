package cn.fxbin.learn.adapter;

import cn.fxbin.learn.adapter.clazz.Adapter;
import cn.fxbin.learn.adapter.clazz.TargetModule;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/7 15:46
 */
public class Main {

    public static void main(String[] args) {
        TargetModule targetModule = new Adapter();

        targetModule.methodA();
        targetModule.methodB();
    }

}
