package cn.fxbin.learn.factory.ab.ali;

import cn.fxbin.learn.factory.ab.OrderFactory;
import cn.fxbin.learn.factory.ab.PayFactory;
import cn.fxbin.learn.factory.ab.RefundFactory;

/**
 * AliOrderFactory
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/4 17:16
 */
public class AliOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
         return new AliPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new AliRefund();
    }
}
