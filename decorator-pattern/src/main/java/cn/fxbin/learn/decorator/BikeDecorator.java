package cn.fxbin.learn.decorator;

/**
 * BikeDecorator
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 15:28
 */
public class BikeDecorator implements Bike {

    private String desc = "啥也不是";

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
