package cn.fxbin.learn.strategy.growth;

/**
 * StrategyContext 策略上下文
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:00
 */
public class StrategyContext {

    public void contextMethod(String strategyCode){
        IStrategy strategy = StrategyFactory.getStrategy(strategyCode);
        if(strategy != null){
            // 调用策略实现的方法
            strategy.strategyMethod();
        }
    }
}
