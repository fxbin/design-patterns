package cn.fxbin.apply.service.impl;

/**
 * ShoppingOfA
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:00
 */
public class ShoppingOfA extends AbstractShopping {

    @Override
    protected void buy() {
        System.out.println("我是小A，在购物车添加了一双皮鞋");
        System.out.println("我是小A，在购物车添加了一条裤子");
    }
}
