package cn.fxbin.learn.flyweight;

/**
 * ConcreteWebSite
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 17:36
 */
public class ConcreteWebSite extends CloudWebSite {

    private String category;

    public ConcreteWebSite(String category) {
        this.category = category;
    }

    @Override
    protected void run(Company company) {
        System.out.println("网站分类：" + category + ", 公司：" + company.getName());
    }
}
