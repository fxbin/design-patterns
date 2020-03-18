package cn.fxbin.apply.service.impl;

import cn.fxbin.apply.service.Shopping;

/**
 * AbstractShopping
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:05
 */
public abstract class AbstractShopping implements Shopping {

    @Override
    public void buyGoods() {
        //登录
        login();
        //购买
        buy();
        //支付
        pay();
    }

    protected void login() {
        System.out.println("手机号码登录");
    }

    protected abstract void buy();

    protected void pay() {
        System.out.println("支付宝支付");
    }
}
