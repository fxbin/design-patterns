package cn.fxbin.learn.decorator;

/**
 * SuonaBikeDecorator
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 15:32
 */
public class SuonaBikeDecorator extends BikeDecorator {

    private String desc = "喇叭";

    private Bike bike;

    public SuonaBikeDecorator(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription() + "," + desc;
    }

    @Override
    public int getPrice() {
        return bike.getPrice() + 50;
    }
}
