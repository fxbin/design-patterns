package cn.fxbin.learn.decorator;

/**
 * BigBike
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 15:22
 */
public class BigBike implements Bike {

    private String desc = "大";

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
