package cn.fxbin.learn.factory.simple;

import cn.fxbin.learn.factory.AliPay;
import cn.fxbin.learn.factory.Pay;
import cn.fxbin.learn.factory.WechatPay;

/**
 * SimplePayFactory
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/2 16:26
 */
public class SimplePayFactory {

    public static Pay createPay(String payType) {
        if (payType == null) {
            return null;
        } else if (payType.equals("wechat-pay")) {
            return new WechatPay();
        } else if (payType.equals("ali-pay")) {
            return new AliPay();
        }
        return null;
    }

}
