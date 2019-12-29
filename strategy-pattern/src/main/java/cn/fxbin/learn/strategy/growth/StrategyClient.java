package cn.fxbin.learn.strategy.growth;

/**
 * StrategyClient
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:01
 */
public class StrategyClient {

    public static void main(String[] args) {

//        IStrategy strategy = StrategyFactory.getStrategy("C");
//        strategy.strategyMethod();
//

        IStrategy strategy = StrategySingleton.getInstance().getStrategy("C");
        strategy.strategyMethod();

    }

}
