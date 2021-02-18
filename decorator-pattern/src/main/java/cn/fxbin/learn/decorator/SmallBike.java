package cn.fxbin.learn.decorator;

/**
 * SmallBike
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 15:22
 */
public class SmallBike implements Bike {

    private String desc = "小";

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
