package cn.fxbin.learn.bridge;

/**
 * Phone
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 11:02
 */
public abstract class Phone {

    /**
     * 通过组合的方式来桥接其它行为
     */
    protected Color color;

    public Phone(Color color) {
        this.color = color;
    }

    /**
     * 手机的方法
     */
    abstract public void run();

}
