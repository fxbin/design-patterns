package cn.fxbin.learn.facade;

/**
 * MessageFacade
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 16:32
 */
public class MessageFacade implements IMessageManager {

    private IMessageManager wechatMessageManager = new WechatMessageManager();

    private IMessageManager dingDingMessageManager = new DingDingMessageManager();

    private IMessageManager smsMessageManager = new SmsMessageManager();

    private IMessageManager mailMessageManager = new MailMessageManager();

    @Override
    public void pushMessage() {
        wechatMessageManager.pushMessage();
        dingDingMessageManager.pushMessage();
        smsMessageManager.pushMessage();
        mailMessageManager.pushMessage();
    }
}
