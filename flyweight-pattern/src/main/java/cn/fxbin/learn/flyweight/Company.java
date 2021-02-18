package cn.fxbin.learn.flyweight;

/**
 * Company
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 17:31
 */
public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }
}
