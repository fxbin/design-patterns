package cn.fxbin.apply.service.impl;

/**
 * ShoppingOfB
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:01
 */
public class ShoppingOfB extends AbstractShopping {


    @Override
    protected void buy() {
        System.out.println("我是小B，在购物车添加了一双运动鞋");
        System.out.println("我是小B，在购物车添加了一件外套");
    }
}
