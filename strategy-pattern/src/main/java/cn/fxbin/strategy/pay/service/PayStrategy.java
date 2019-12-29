package cn.fxbin.strategy.pay.service;

/**
 * PayStrategy 支付抽象策略
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:26
 */
public interface PayStrategy {

    /**
     * pay
     *
     * @author fxbin
     * @since 2019/12/29 22:26
     * @return java.lang.String
     */
    String pay();

}
