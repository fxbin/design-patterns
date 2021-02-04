package cn.fxbin.learn.factory.ab.ali;

import cn.fxbin.learn.factory.ab.PayFactory;

/**
 * AliPay
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/4 17:20
 */
public class AliPay implements PayFactory {
    @Override
    public void unifiedorder() {
        System.out.println("阿里 统一下单");
    }
}
