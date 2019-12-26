package cn.fxbin.learn.patterns.gateway.handler;

/**
 * ParamGatewayHandler 参数过滤拦截
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:25
 */
public class ParamGatewayHandler extends GatewayHandler {
    @Override
    public void service() {
        System.out.println("第四步，参数过滤拦截");
        if(this.next != null){
            this.next.service();
        }
    }
}
