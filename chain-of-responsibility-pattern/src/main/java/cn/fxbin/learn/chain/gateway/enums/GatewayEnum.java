package cn.fxbin.learn.chain.gateway.enums;

import cn.fxbin.learn.chain.gateway.model.Gateway;

/**
 * GetewayEnum
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 14:33
 */
public enum GatewayEnum {

    API_HANDLER(new Gateway(1, "Api接口限流", "cn.fxbin.learn.patterns.gateway.handler.ApiLimitGatewayHandler", null, 2)),
    BLACKLIST_HANDLER(new Gateway(2, "黑名单", "cn.fxbin.learn.patterns.gateway.handler.BlacklistGatewayHandler", 1, 3)),
    SESSION_HANDLER(new Gateway(3, "会话拦截", "cn.fxbin.learn.patterns.gateway.handler.SessionGatewayHandler", 2, 4)),
    PARAM_HANDLER(new Gateway(4, "参数过滤拦截", "cn.fxbin.learn.patterns.gateway.handler.ParamGatewayHandler", 3, null));

    Gateway gateway;

    public Gateway getGateway() {
        return gateway;
    }

    GatewayEnum(Gateway gateway) {
        this.gateway = gateway;
    }
}
