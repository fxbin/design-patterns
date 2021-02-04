package cn.fxbin.learn.factory;

import cn.fxbin.learn.factory.ab.FactoryProducer;
import cn.fxbin.learn.factory.ab.OrderFactory;
import cn.fxbin.learn.factory.method.AliPayFactory;
import cn.fxbin.learn.factory.method.PayFactory;
import cn.fxbin.learn.factory.simple.SimplePayFactory;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/2 16:28
 */
public class Main {

    public static void main(String[] args) {
        // 简单工厂
//        Pay pay = SimplePayFactory.createPay("ali-pay");
//        pay.unifiedorder();

        PayFactory factory = new AliPayFactory();
        factory.getPay().unifiedorder();


        OrderFactory ali = FactoryProducer.getFactory("ALI");
        ali.createPay().unifiedorder();
        ali.createRefund().refund();

    }

}
