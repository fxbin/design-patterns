package cn.fxbin.learn.strategy.price;

/**
 * IPriceStrategy
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:16
 */
public interface IPriceStrategy {

    /**
     * getPrice
     *
     * <p>
     *     价格策略
     * </p>
     *
     * @author fxbin
     * @since 2019/12/29 22:17
     * @param originalPrice 原价
     * @return double
     */
    double getPrice(double originalPrice);

}
