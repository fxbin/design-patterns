package cn.fxbin.learn.strategy.demo;

/**
 * StrategyClient
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:01
 */
public class StrategyClient {

    public static void main(String[] args) {
//        //1.创建具体策略
//        IStrategy strategy = new AStrategy();
//        //2.将具体的策略对象注入到策略上下文中
//        StrategyContext ctx = new StrategyContext(strategy);
//        //3.对具体策略实现的调用
//        ctx.contextMethod();


        StrategyContext ctx = new StrategyContext();
        ctx.contextMethod("A");

    }

}
