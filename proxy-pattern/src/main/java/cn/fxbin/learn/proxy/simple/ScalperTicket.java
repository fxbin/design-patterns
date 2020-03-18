package cn.fxbin.learn.proxy.simple;

/**
 * ScalperTicket
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/3/18 17:40
 */
public class ScalperTicket implements Ticket {

    private OfficialTicket officialTicket;

    public ScalperTicket(OfficialTicket officialTicket) {
        this.officialTicket = officialTicket;
    }

    @Override
    public void buyTicket() {
        System.out.println("黄牛准备买票啦，XXX，请给一下乘车人信息呗");
        // 实际购票也是官方渠道
        officialTicket.buyTicket();
        System.out.println("黄牛购票成功...");
    }
}
