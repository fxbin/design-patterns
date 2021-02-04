package cn.fxbin.learn.factory;

/**
 * AliPay
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/2 16:24
 */
public class AliPay implements Pay{

    @Override
    public void unifiedorder() {
        System.out.println("支付宝支付 统一下单接口");
    }
}
