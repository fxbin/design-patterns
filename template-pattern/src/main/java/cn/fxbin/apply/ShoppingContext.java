package cn.fxbin.apply;

import cn.fxbin.apply.service.Shopping;

import java.util.HashMap;
import java.util.Map;

/**
 * ShoppingContext
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:02
 */
public class ShoppingContext {

    /**
     * 存储具体的策略
     */
    private Map<String,String> strategyMap;
    private static ShoppingContext instance;

    private ShoppingContext(){
        this.init();
    }
    /**
     * 初始化具体策略的映射关系
     */
    private void init(){
        this.strategyMap = new HashMap<>();
        // 小A的具体策略
        this.strategyMap.put("1","cn.fxbin.apply.service.impl.ShoppingOfA");
        // 小B的具体策略
        this.strategyMap.put("2","cn.fxbin.apply.service.impl.ShoppingOfB");
    }

    public static ShoppingContext getInstance() {
        if (instance == null) {
            synchronized (ShoppingContext.class) {
                if (instance == null) {
                    instance = new ShoppingContext();
                }
            }
        }
        return instance;
    }
    public Shopping getStrategy(String strategyCode){
        try {
            String className = this.strategyMap.get(strategyCode);
            Class<?> clazz = Class.forName(className);
            return (Shopping) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
