package cn.fxbin.learn.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDKProxy
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:49
 */
public class JDKProxy implements InvocationHandler {

    /**
     * 目标对象，即原对象
     */
    private Object target;

    public JDKProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("========动态代理开始=======");
        Object result = method.invoke(target, args);
        System.out.println("========动态代理结束=======");
        return result;
    }
}
