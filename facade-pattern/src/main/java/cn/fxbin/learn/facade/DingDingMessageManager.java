package cn.fxbin.learn.facade;

/**
 * DingDingMessageManager
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 16:30
 */
public class DingDingMessageManager implements IMessageManager {
    @Override
    public void pushMessage() {
        System.out.println("钉钉消息推送");
    }
}
