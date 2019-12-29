package cn.fxbin.learn.chain.gateway.handler;

/**
 * GatewayHandler
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:20
 */
public abstract class GatewayHandler {

    protected GatewayHandler next;

    public void setNext(GatewayHandler next) {
        this.next = next;
    }

    public abstract void service();

}
