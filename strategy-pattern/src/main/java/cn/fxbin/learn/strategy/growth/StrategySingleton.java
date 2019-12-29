package cn.fxbin.learn.strategy.growth;

import java.util.HashMap;
import java.util.Map;

/**
 * StrategySingleton
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:12
 */
public class StrategySingleton {


    /**
     * 存储具体的策略
     */
    private Map<String,String> strategyMap;
    private static StrategySingleton instance;

    private StrategySingleton(){
        this.init();
    }

    private void init(){
        this.strategyMap = new HashMap<>();

        this.strategyMap.put("A","cn.fxbin.learn.strategy.growth.AStrategy");
        this.strategyMap.put("B","cn.fxbin.learn.strategy.growth.BStrategy");
        this.strategyMap.put("C","cn.fxbin.learn.strategy.growth.CStrategy");
        this.strategyMap.put("D","cn.fxbin.learn.strategy.growth.DStrategy");
    }

    public static StrategySingleton getInstance() {
        if (instance == null) {
            synchronized (StrategySingleton.class) {
                if (instance == null) {
                    instance = new StrategySingleton();
                }
            }
        }
        return instance;
    }

    public IStrategy getStrategy(String strategyCode){
        try {
            String className = this.strategyMap.get(strategyCode);
            Class<?> clazz = Class.forName(className);
            return (IStrategy) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
