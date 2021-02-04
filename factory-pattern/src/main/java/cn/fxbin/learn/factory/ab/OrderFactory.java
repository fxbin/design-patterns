package cn.fxbin.learn.factory.ab;

/**
 * OrderFactory
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/4 17:15
 */
public interface OrderFactory {

    PayFactory createPay();

    RefundFactory createRefund();

}
