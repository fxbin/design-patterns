package cn.fxbin.strategy.pay.service.impl;

import cn.fxbin.strategy.pay.service.PayStrategy;
import org.springframework.stereotype.Service;

/**
 * WeChatPayStrategy
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:27
 */
@Service
public class WeChatPayStrategy implements PayStrategy {
    @Override
    public String pay() {
        return "调用微信支付...";
    }
}
