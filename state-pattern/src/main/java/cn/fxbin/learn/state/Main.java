package cn.fxbin.learn.state;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 18:12
 */
public class Main {

    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        orderContext.setState(new NewOrderState());

        orderContext.setState(new PayOrderState());

        orderContext.setState(new SendOrderState());

    }

}
