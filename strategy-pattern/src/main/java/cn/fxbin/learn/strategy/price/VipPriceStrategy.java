package cn.fxbin.learn.strategy.price;

/**
 * VipPriceStrategy VIP客户策略
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:18
 */
public class VipPriceStrategy implements IPriceStrategy {
    @Override
    public double getPrice(double originalPrice) {
        System.out.println("vip客户，满100减40，不满100，打7折");
        if(originalPrice >= 100){
            return originalPrice - 40;
        }
        return originalPrice * 0.7;
    }
}
