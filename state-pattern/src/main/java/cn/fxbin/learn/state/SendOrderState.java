package cn.fxbin.learn.state;

/**
 * PayOrderState
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 18:08
 */
public class SendOrderState implements State {
    @Override
    public void handle() {
        System.out.println("订单已发货");
        System.out.println("调用短信服务，告诉用户已经发货");
        System.out.println("更新物流信息\n");
    }
}
