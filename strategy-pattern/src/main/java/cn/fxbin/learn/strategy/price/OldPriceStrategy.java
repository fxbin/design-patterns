package cn.fxbin.learn.strategy.price;

/**
 * OldPriceStrategy 老客户策略
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:18
 */
public class OldPriceStrategy implements IPriceStrategy {
    @Override
    public double getPrice(double originalPrice) {
        System.out.println("老客户，打9折");
        return originalPrice * 0.9;
    }
}
