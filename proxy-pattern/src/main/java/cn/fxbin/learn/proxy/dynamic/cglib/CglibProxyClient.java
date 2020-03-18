package cn.fxbin.learn.proxy.dynamic.cglib;

import cn.fxbin.learn.proxy.simple.OfficialTicket;
import cn.fxbin.learn.proxy.simple.Ticket;
import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * CglibProxyClient
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 18:01
 */
public class CglibProxyClient {

    public static void main(String[] args) {
        // 代理类的 位置
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\Project\\Github\\design-patterns\\proxy-pattern\\src\\main\\java\\cn\\fxbin\\learn\\proxy\\dynamic\\cglib");
        Ticket official = CglibProxyUtil.getCglibProxy(new OfficialTicket());
        official.buyTicket();
    }

}
