package cn.fxbin.learn.chain.demo;

/**
 * ConcreteHandler_A 具体处理者A
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:15
 */
public class ConcreteHandler_A extends AbstractHandler {
    @Override
    public void handlerRequest() {
        if(this.next != null){
            this.next.handlerRequest();
        }
    }
}
