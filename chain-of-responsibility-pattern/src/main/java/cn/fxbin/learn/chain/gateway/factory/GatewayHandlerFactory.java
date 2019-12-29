package cn.fxbin.learn.chain.gateway.factory;

import cn.fxbin.learn.chain.gateway.handler.*;

/**
 * GetewayHandlerFactory
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:29
 */
public class GatewayHandlerFactory {

    public static GatewayHandler getFirstGatewayHandler() {
        //api接口限流
        GatewayHandler apiLimitGatewayHandler = new ApiLimitGatewayHandler();
        //黑名单拦截
        GatewayHandler blacklistGatewayHandler = new BlacklistGatewayHandler();
        //用户会话拦截
        GatewayHandler sessionGatewayHandler = new SessionGatewayHandler();
        //参数过滤
        GatewayHandler paramGatewayHandler = new ParamGatewayHandler();


        //api接口限流的下一步是黑名单拦截
        apiLimitGatewayHandler.setNext(blacklistGatewayHandler);
        //黑名单拦截的下一步是用户会话拦截
        blacklistGatewayHandler.setNext(sessionGatewayHandler);
        //用户会话拦截的下一步是参数果过滤拦截
        sessionGatewayHandler.setNext(paramGatewayHandler);

        return apiLimitGatewayHandler;
    }

}
