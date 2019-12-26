package cn.fxbin.learn.patterns.gateway.service.impl;

import cn.fxbin.learn.patterns.gateway.enums.GatewayEnum;
import cn.fxbin.learn.patterns.gateway.model.Gateway;
import cn.fxbin.learn.patterns.gateway.service.GatewayService;

import java.util.*;
import java.util.stream.Collectors;

/**
 * GatewayServiceImpl
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/26 16:47
 */
public class GatewayServiceImpl implements GatewayService {

    /**
     * 初始化gateway 枚举
     */
    private static Map<Integer, Gateway> gatewayMap = new HashMap<>();

    static {
        gatewayMap = Arrays.stream(GatewayEnum.values())
                .collect(Collectors.toMap(
                        it -> it.getGateway().getHandlerId(),
                        GatewayEnum::getGateway
                ));
    }


    @Override
    public Gateway getGatewayByHandlerId(Integer handlerId) {
        return gatewayMap.get(handlerId);
    }

    @Override
    public Gateway getFirstGateway() {

        List<Gateway> gatewayHandlerList = gatewayMap.keySet().stream()
                .filter(key -> Objects.isNull(gatewayMap.get(key).getPreHandlerId()))
                .map(id -> gatewayMap.get(id))
                .collect(Collectors.toList());

        return Optional.ofNullable(gatewayHandlerList.get(0)).orElse(null);
    }
}
