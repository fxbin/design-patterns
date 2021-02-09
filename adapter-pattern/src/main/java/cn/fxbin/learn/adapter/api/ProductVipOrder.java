package cn.fxbin.learn.adapter.api;

/**
 * ProductVipOrder
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/9 11:31
 */
public class ProductVipOrder extends PayGatewayAdapter {

    @Override
    public void unifiedorder() {
        System.out.println("ProductVipOrder.unifiedorder");
    }

    @Override
    public void refund() {
        System.out.println("ProductVipOrder.refund");
    }

    @Override
    public void sendRedPack() {
        System.out.println("ProductVipOrder.sendRedPack");
    }
}
