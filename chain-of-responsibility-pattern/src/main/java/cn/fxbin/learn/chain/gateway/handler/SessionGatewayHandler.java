package cn.fxbin.learn.chain.gateway.handler;

/**
 * SessionGatewayHandler
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:25
 */
public class SessionGatewayHandler extends GatewayHandler {
    @Override
    public void service() {
        System.out.println("第三步，用户会话拦截校验");
        if(this.next != null){
            this.next.service();
        }
    }
}
