package cn.fxbin.learn.bridge;

/**
 * HWPhone
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 11:49
 */
public class HWPhone extends Phone {
    public HWPhone(Color color) {
        super(color);
    }

    @Override
    public void run() {
        color.userColor();
        System.out.println("华为手机");
    }
}
