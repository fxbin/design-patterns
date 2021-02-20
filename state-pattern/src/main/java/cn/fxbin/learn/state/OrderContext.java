package cn.fxbin.learn.state;

/**
 * OrderContext
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 18:10
 */
public class OrderContext {

    private State state;

    public OrderContext() {
    }
//    public OrderContext(State state) {
//        this.state = state;
//    }


    public void setState(State state) {
        this.state = state;
        System.out.println("订单状态变更");
        this.state.handle();
    }


}
