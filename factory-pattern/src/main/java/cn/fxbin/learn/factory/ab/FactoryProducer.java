package cn.fxbin.learn.factory.ab;

import cn.fxbin.learn.factory.ab.ali.AliOrderFactory;
import cn.fxbin.learn.factory.ab.wechat.WechatOrderFactory;

/**
 * FactoryProducer
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/4 17:23
 */
public class FactoryProducer {

    public static OrderFactory getFactory(String type) {
        if (type.isEmpty()) {
            return null;
        }

        if (type.equals("WECHAT")) {
            return new WechatOrderFactory();
        } else if (type.equals("ALI")) {
            return new AliOrderFactory();
        }
        return null;
    }

}
