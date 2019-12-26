package cn.fxbin.learn.patterns.demo;

/**
 * HandlerClient
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:16
 */
public class HandlerClient {

    public static void main(String[] args) {
        AbstractHandler firstHandler = new HandlerClient().getFirstHandler();
        // 调用第一个处理者的handler方法
        firstHandler.handlerRequest();
    }

    /**
     * 设置责任链 并返回第一个处理者
     * @return
     */
    public AbstractHandler getFirstHandler(){
        AbstractHandler a = new ConcreteHandler_A();
        AbstractHandler b = new ConcreteHandler_B();

        a.setNext(b);

        return a;

    }
}
