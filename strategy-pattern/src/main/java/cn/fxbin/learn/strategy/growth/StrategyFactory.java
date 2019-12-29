package cn.fxbin.learn.strategy.growth;

/**
 * StrategyFactory
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:10
 */
public class StrategyFactory {

    public static IStrategy getStrategy(String strategyCode){
        try {
            StrategyEnum strategyEnum = StrategyEnum.valueOf(strategyCode);
            String className = strategyEnum.getClassName();
            Class<?> clazz = Class.forName(className);
            return (IStrategy) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
