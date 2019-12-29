package cn.fxbin.learn.strategy.price;

/**
 * StrategyClient
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:23
 */
public class StrategyClient {

    public static void main(String[] args) {
        IPriceStrategy strategy = StrategyContext.getInstance().getStrategy("vip");
        if(strategy != null){
            strategy.getPrice(100);
        }
    }

}
