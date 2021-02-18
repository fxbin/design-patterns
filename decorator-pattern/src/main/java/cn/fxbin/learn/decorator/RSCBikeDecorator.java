package cn.fxbin.learn.decorator;

/**
 * RSCBikeDecorator
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 15:30
 */
public class RSCBikeDecorator extends BikeDecorator {

    private String desc = "防爆胎";

    private Bike bike;

    public RSCBikeDecorator(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + "," + desc;
    }

    @Override
    public int getPrice() {
        return bike.getPrice() + 100;
    }
}
