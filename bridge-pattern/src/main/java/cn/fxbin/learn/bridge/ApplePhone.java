package cn.fxbin.learn.bridge;

/**
 * ApplePhone
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 11:51
 */
public class ApplePhone extends Phone {

    public ApplePhone(Color color) {
        super(color);
    }

    @Override
    public void run() {
        System.out.println("苹果手机");
    }
}
