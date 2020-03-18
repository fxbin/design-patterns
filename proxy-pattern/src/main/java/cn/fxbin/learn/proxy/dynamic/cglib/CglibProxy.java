package cn.fxbin.learn.proxy.dynamic.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CglibProxy
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:58
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * intercept
     *
     * @author fxbin
     * @since 2020/3/18 17:59
     * @param o 目标类的实例
     * @param method 目标方法实例（通过反射获取的目标方法实例）
     * @param objects 目标方法的参数
     * @param methodProxy 代理类的实例
     * @return java.lang.Object
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("========Cglib动态代理开始=======");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("========Cglib动态代理结束=======");

        return result;
    }
}
