package cn.fxbin.learn.patterns.gateway.handler;

/**
 * BlacklistGatewayHandler 黑名单拦截
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:23
 */
public class BlacklistGatewayHandler extends GatewayHandler {
    @Override
    public void service() {
        System.out.println("第二步，黑名单拦截校验");
        if(this.next != null){
            this.next.service();
        }
    }
}
