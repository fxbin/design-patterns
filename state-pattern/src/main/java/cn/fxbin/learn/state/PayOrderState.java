package cn.fxbin.learn.state;

/**
 * PayOrderState
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 18:08
 */
public class PayOrderState implements State {
    @Override
    public void handle() {
        System.out.println("新订单已支付");
        System.out.println("调用商户客服服务，订单已经支付");
        System.out.println("调用物流服务，未发货\n");
    }
}
