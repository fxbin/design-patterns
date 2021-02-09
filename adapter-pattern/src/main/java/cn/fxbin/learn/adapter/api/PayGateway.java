package cn.fxbin.learn.adapter.api;

/**
 * PayGateway
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/9 11:26
 */
public interface PayGateway {

    /**
     * 下单
     */
    void unifiedorder();

    /**
     * 退款
     */
    void refund();

    /**
     * 查询支付状态
     */
    void query();

    /**
     * 发红包
     */
    void sendRedPack();

}
