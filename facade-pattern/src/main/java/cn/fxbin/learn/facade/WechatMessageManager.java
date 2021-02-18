package cn.fxbin.learn.facade;

/**
 * WechatMessageManager
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 16:29
 */
public class WechatMessageManager implements IMessageManager {
    @Override
    public void pushMessage() {
        System.out.println("微信消息推送");
    }
}
