package cn.fxbin.learn.patterns.gateway.factory;

import cn.fxbin.learn.patterns.gateway.handler.GatewayHandler;
import cn.fxbin.learn.patterns.gateway.model.Gateway;
import cn.fxbin.learn.patterns.gateway.service.GatewayService;
import cn.fxbin.learn.patterns.gateway.service.impl.GatewayServiceImpl;

import java.io.Serializable;
import java.util.Objects;

/**
 * GetewayHandlerEnumFactory
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 16:58
 */
public class GatewayHandlerEnumFactory {

    private static GatewayService gatewayService = new GatewayServiceImpl();

    public static GatewayHandler getFirstGatewayHandler() {
        Gateway firstGateway = gatewayService.getFirstGateway();
        GatewayHandler firstGatewayHandler = gatewayHandler(firstGateway);

        if (Objects.isNull(firstGatewayHandler)) {
            return null;
        }

//        Gateway tempGateway = firstGateway;
//        GatewayHandler tempGatewayHandler = firstGatewayHandler;
//        while (tempGateway.getNextHandlerId() != null) {
//            Gateway gateway = gatewayService.getGatewayByHandlerId(tempGateway.getNextHandlerId());
//            GatewayHandler handler = gatewayHandler(gateway);
//            assert tempGatewayHandler != null;
//            tempGatewayHandler.setNext(handler);
//            tempGatewayHandler = handler;
//            tempGateway = gateway;
//        }

        setGatewayHandler(firstGateway, firstGatewayHandler);

        return firstGatewayHandler;
    }

    private static void setGatewayHandler(Gateway gateway, GatewayHandler gatewayHandler) {
        if (Objects.nonNull(gateway.getNextHandlerId()) && Objects.nonNull(gatewayHandler)) {
            Gateway nextGateway = gatewayService.getGatewayByHandlerId(gateway.getNextHandlerId());
            GatewayHandler nextGatewayHandler = gatewayHandler(nextGateway);
            gatewayHandler.setNext(nextGatewayHandler);
            setGatewayHandler(nextGateway, nextGatewayHandler);
        }
    }

    public static GatewayHandler gatewayHandler(Gateway gateway) {
        String handlerClassName = gateway.getHandlerClassName();

        try {
            Class<?> clazz = Class.forName(handlerClassName);
            return (GatewayHandler) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
