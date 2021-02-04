package cn.fxbin.learn.factory.method;

import cn.fxbin.learn.factory.Pay;
import cn.fxbin.learn.factory.WechatPay;

/**
 * WechatPayFactory
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/2 17:26
 */
public class WechatPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new WechatPay();
    }
}
