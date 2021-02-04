package cn.fxbin.learn.factory.ab.wechat;

import cn.fxbin.learn.factory.ab.RefundFactory;

/**
 * WechatRefund
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/4 17:21
 */
public class WechatRefund implements RefundFactory {

    @Override
    public void refund() {
        System.out.println("微信支付退款");
    }
}
