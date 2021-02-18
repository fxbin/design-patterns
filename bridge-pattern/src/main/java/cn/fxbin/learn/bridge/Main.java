package cn.fxbin.learn.bridge;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 11:50
 */
public class Main {

    public static void main(String[] args) {
        HWPhone blueHwPhone = new HWPhone(new BlueColor());
        blueHwPhone.run();

        HWPhone redHwPhone = new HWPhone(new RedColor());
        redHwPhone.run();

        ApplePhone applePhone = new ApplePhone(new RedColor());
        applePhone.run();


    }

}
