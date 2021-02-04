package cn.fxbin.learn.factory.ab.ali;

import cn.fxbin.learn.factory.ab.RefundFactory;

/**
 * AliRefund
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/4 17:20
 */
public class AliRefund implements RefundFactory {

    @Override
    public void refund() {
        System.out.println("支付宝支付退款");
    }
}
