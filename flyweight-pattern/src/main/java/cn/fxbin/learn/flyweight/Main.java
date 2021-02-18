package cn.fxbin.learn.flyweight;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 17:41
 */
public class Main {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        CloudWebSite companySite1 = factory.getWebSiteByCategory("企业官网");
        companySite1.run(new Company("A"));

        CloudWebSite companySite2 = factory.getWebSiteByCategory("企业官网");
        companySite2.run(new Company("B"));
    }

}
