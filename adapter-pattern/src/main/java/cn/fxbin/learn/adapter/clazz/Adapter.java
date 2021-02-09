package cn.fxbin.learn.adapter.clazz;

/**
 * Adapter
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/9 11:42
 */
public class Adapter extends OldModule implements TargetModule {


    @Override
    public void methodB() {
        System.out.println("Adapter methodB");
    }
}
