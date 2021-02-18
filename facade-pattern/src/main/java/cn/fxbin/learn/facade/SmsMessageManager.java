package cn.fxbin.learn.facade;

/**
 * SmsMessageManager
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 16:30
 */
public class SmsMessageManager implements IMessageManager {
    @Override
    public void pushMessage() {
        System.out.println("短信消息推送");
    }
}
