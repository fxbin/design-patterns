package cn.fxbin.apply;

/**
 * ShoppingClient
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:04
 */
public class ShoppingClient {

    public static void main(String[] args) {
        // 1表示小A的策略
        ShoppingContext.getInstance().getStrategy("1").buyGoods();
        // 2表示小B的策略
        ShoppingContext.getInstance().getStrategy("2").buyGoods();
    }

}
