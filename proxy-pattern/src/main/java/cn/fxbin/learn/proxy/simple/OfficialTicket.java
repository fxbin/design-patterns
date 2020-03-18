package cn.fxbin.learn.proxy.simple;

/**
 * OfficialTicket
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:40
 */
public class OfficialTicket implements Ticket {

    @Override
    public void buyTicket() {
        System.out.println("您好，我的姓名是：XXX，" +
                    "身份证号是：....XXXX....，我想买一张北京--昆明的高铁票");
    }
}
