package cn.fxbin.learn.factory.method;

import cn.fxbin.learn.factory.AliPay;
import cn.fxbin.learn.factory.Pay;

/**
 * AliPayFactory
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/2 17:25
 */
public class AliPayFactory implements PayFactory {
    @Override
    public Pay getPay() {
        return new AliPay();
    }
}
