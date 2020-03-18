package cn.fxbin.learn.proxy.dynamic.jdk;

import cn.fxbin.learn.proxy.simple.OfficialTicket;
import cn.fxbin.learn.proxy.simple.Ticket;

/**
 * ProxyClient
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:51
 */
public class ProxyClient {

    public static void main(String[] args) {

        Ticket official = ProxyUtil.getProxy(new OfficialTicket());
        official.buyTicket();
    }

}
