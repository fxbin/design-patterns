package cn.fxbin.learn.factory.ab.wechat;

import cn.fxbin.learn.factory.ab.PayFactory;

/**
 * WechatPay
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/4 17:21
 */
public class WechatPay implements PayFactory {
    @Override
    public void unifiedorder() {
        System.out.println("微信 统一下单");
    }
}
