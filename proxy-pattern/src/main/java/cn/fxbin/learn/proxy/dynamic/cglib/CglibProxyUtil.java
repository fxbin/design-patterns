package cn.fxbin.learn.proxy.dynamic.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * CglibProxyUtil
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 18:00
 */
public class CglibProxyUtil {

    public static <T> T getCglibProxy(Object o){
        Enhancer enhancer = new Enhancer();
        // 设置代理类的父类
        enhancer.setSuperclass(o.getClass());
        // 设置回调对象
        enhancer.setCallback(new CglibProxy());
        // 创建代理对象
        return (T) enhancer.create();
    }

}
