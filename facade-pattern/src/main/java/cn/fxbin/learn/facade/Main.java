package cn.fxbin.learn.facade;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 16:35
 */
public class Main {

    public static void main(String[] args) {
        IMessageManager iMessageManager = new MessageFacade();
        iMessageManager.pushMessage();
    }

}
