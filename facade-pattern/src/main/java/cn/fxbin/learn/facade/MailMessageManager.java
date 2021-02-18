package cn.fxbin.learn.facade;

/**
 * MailMessageManager
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 16:31
 */
public class MailMessageManager implements IMessageManager {
    @Override
    public void pushMessage() {
        System.out.println("邮件消息推送");
    }
}
