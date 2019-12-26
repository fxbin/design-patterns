package cn.fxbin.learn.patterns.gateway.service;

import cn.fxbin.learn.patterns.gateway.model.Gateway;

/**
 * GatewayDao
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 16:45
 */
public interface GatewayService {


    /**
     * getGatewayByHandlerId
     *
     * @author fxbin
     * @since 2019/12/26 16:46
     * @param handlerId handler Id
     * @return cn.fxbin.learn.patterns.gateway.model.Gateway
     */
    Gateway getGatewayByHandlerId(Integer handlerId);

    /**
     * getFirstGateway
     *
     * @author fxbin
     * @since 2019/12/26 16:45
     * @return cn.fxbin.learn.patterns.gateway.model.Gateway
     */
    Gateway getFirstGateway();

}
