package cn.fxbin.strategy.pay.service.impl;

import cn.fxbin.strategy.pay.service.PayStrategy;
import org.springframework.stereotype.Service;

/**
 * AliPayStrategy
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:27
 */
@Service
public class AliPayStrategy implements PayStrategy {
    @Override
    public String pay() {
        return "调用支付宝支付...";
    }
}
