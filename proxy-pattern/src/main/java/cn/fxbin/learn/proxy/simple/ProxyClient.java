package cn.fxbin.learn.proxy.simple;

/**
 * ProxyClient
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:43
 */
public class ProxyClient {

    public static void main(String[] args) {
        ScalperTicket scalperTicket = new ScalperTicket(new OfficialTicket());
        scalperTicket.buyTicket();
    }

}
