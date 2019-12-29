package cn.fxbin.learn.strategy.demo;

/**
 * StrategyContext 策略上下文
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:00
 */
public class StrategyContext {

    /**
     * 持有一个策略实现的引用
     */
    private IStrategy strategy;

    /**
     * StrategyContext 使用构造器注入具体的策略类
     *
     * @author fxbin
     * @since 2019/12/29 22:01
     * @param strategy 策略
     */
    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public StrategyContext() {
    }

    // 1. 缺陷版
    public void contextMethod(){
        //调用策略实现的方法
        strategy.strategyMethod();
    }

    // 2. 改良版
    public void contextMethod(String strategyCode){
        IStrategy strategy = null;
        //根据方法传入的strategyCode 判断要实例化哪个具体的实现策略
        //这样客户端调用只需要传入具体的strategyCode 进行选择即可
        if("A".equals(strategyCode)){
            strategy = new AStrategy();
        } else if("B".equals(strategyCode)){
            strategy = new BStrategy();
        } else if("C".equals(strategyCode)){
            strategy = new CStrategy();
        }
        //todo 此处应该有一个判断为null，忽略

        // 调用策略实现的方法
        strategy.strategyMethod();
    }
}
