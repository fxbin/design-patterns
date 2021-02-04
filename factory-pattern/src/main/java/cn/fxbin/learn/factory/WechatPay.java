package cn.fxbin.learn.factory;

/**
 * WechatPay
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/2 16:23
 */
public class WechatPay implements Pay {
    @Override
    public void unifiedorder() {
        System.out.println("微信支付 统一下单接口");
    }
}
