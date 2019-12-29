package cn.fxbin.learn.chain.gateway.handler;

/**
 * ApiLimitGatewayHandler
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:23
 */
public class ApiLimitGatewayHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("第一步，api接口限流校验");
        if(this.next != null){
            this.next.service();
        }
    }
}
