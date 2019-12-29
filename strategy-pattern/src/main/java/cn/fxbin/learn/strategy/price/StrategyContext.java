package cn.fxbin.learn.strategy.price;

import java.util.HashMap;
import java.util.Map;

/**
 * StrategyContext 策略上下文
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:22
 */
public class StrategyContext {

    /**
     * 存储具体的策略
     */
    private Map<String,String> strategyMap;
    private static StrategyContext instance;

    private StrategyContext(){
        this.init();
    }

    /**
     * 初始化具体策略的映射关系
     */
    private void init(){
        this.strategyMap = new HashMap<>();

        this.strategyMap.put("vip","cn.fxbin.learn.strategy.price.VipPriceStrategy");
        this.strategyMap.put("new","cn.fxbin.learn.strategy.price.NewPriceStrategy");
        this.strategyMap.put("old","cn.fxbin.learn.strategy.price.OldPriceStrategy");
    }

    public static StrategyContext getInstance() {
        if (instance == null) {
            synchronized (StrategyContext.class) {
                if (instance == null) {
                    instance = new StrategyContext();
                }
            }
        }
        return instance;
    }
    public IPriceStrategy getStrategy(String strategyCode){
        try {
            String className = this.strategyMap.get(strategyCode);
            Class<?> clazz = Class.forName(className);
            return (IPriceStrategy) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
