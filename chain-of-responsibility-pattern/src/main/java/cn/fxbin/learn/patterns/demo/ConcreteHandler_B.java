package cn.fxbin.learn.patterns.demo;

/**
 * ConcreteHandler_B 具体处理者B
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:16
 */
public class ConcreteHandler_B extends AbstractHandler {
    @Override
    public void handlerRequest() {
        if(this.next != null){
            this.next.handlerRequest();
        }
    }
}
