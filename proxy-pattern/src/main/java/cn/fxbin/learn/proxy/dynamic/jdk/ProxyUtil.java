package cn.fxbin.learn.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * ProxyUtil
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:51
 */
public class ProxyUtil {

    public static <T> T getProxy(Object target) {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new JDKProxy(target));
    }

}
