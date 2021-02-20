package cn.fxbin.learn.command.smarthome;

/**
 * ConditionReceiver  命令执行者
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 16:11
 */
public class ConditionReceiver {

    public void on() {
        System.out.println("空调开启");
    }

    public void off() {
        System.out.println("空调关闭");
    }

    public void cool() {
        System.out.println("空调制冷");
    }

    public void warm() {
        System.out.println("空调制暖");
    }
}
