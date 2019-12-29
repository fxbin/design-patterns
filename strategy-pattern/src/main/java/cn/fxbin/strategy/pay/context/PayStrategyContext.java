package cn.fxbin.strategy.pay.context;

import cn.fxbin.strategy.pay.service.PayStrategy;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * PayStrategyContext
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:28
 */
@Component
public class PayStrategyContext implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    /**
     * 存储具体的策略
     */
    private Map<String,String> beanMap;

    /**
     * 初始化具体策略的映射关系
     * key:策略key
     * value：具体策略的beanId
     */

    @PostConstruct
    private void init(){
        this.beanMap = new HashMap<>();
        this.beanMap.put("ali","aliPayStrategy");
        this.beanMap.put("wechat","weChatPayStrategy");
    }

    public PayStrategy getStrategy(String strategyCode){
        String beanId = this.beanMap.get(strategyCode);
        return applicationContext.getBean(beanId, PayStrategy.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        PayStrategyContext.applicationContext = applicationContext;
    }
}
