package cn.fxbin.learn.adapter.api;

/**
 * ProductVideoOrder
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/9 11:28
 */
public class ProductVideoOrder extends PayGatewayAdapter {

    @Override
    public void unifiedorder() {
        System.out.println("ProductVideoOrder.unifiedorder");

    }

    @Override
    public void refund() {
        System.out.println("ProductVideoOrder.refund");
    }
}
