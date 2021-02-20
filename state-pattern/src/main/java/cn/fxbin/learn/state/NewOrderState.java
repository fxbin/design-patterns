package cn.fxbin.learn.state;

/**
 * NewOrderState
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 18:08
 */
public class NewOrderState implements State {
    @Override
    public void handle() {
        System.out.println("新订单，未支付");
        System.out.println("调用商户客服服务，有新订单\n");
    }
}
