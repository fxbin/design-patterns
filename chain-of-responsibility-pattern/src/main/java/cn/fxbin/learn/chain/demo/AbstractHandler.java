package cn.fxbin.learn.chain.demo;

/**
 * AbstractHandler
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:08
 */
public abstract class AbstractHandler {

    protected AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public abstract void handlerRequest();
}
