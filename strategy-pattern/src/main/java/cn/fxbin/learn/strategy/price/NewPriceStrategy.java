package cn.fxbin.learn.strategy.price;

/**
 * NewPriceStrategy 新客户实现策略
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:17
 */
public class NewPriceStrategy implements IPriceStrategy{
    @Override
    public double getPrice(double originalPrice) {
        System.out.println("新客户，满10减3");
        if(originalPrice >= 10){
            return originalPrice -3;
        }
        return originalPrice;
    }
}
