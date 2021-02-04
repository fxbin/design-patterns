package cn.fxbin.learn.factory.ab.wechat;

import cn.fxbin.learn.factory.ab.OrderFactory;
import cn.fxbin.learn.factory.ab.PayFactory;
import cn.fxbin.learn.factory.ab.RefundFactory;

/**
 * WechatOrderFactory
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/4 17:16
 */
public class WechatOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new WechatPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new WechatRefund();
    }
}
