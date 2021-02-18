package cn.fxbin.learn.decorator;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 15:36
 */
public class Main {

    public static void main(String[] args) {
        Bike bike = new BigBike();

        bike = new RSCBikeDecorator(bike);
        bike = new RSCBikeDecorator(bike);

        bike = new SuonaBikeDecorator(bike);

        System.out.println(bike.getDescription() + ", 价格：" + bike.getPrice());
    }

}
