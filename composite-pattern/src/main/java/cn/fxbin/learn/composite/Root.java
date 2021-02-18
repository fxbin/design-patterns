package cn.fxbin.learn.composite;

/**
 * Root
 *
 * <p>
 *     根节点，抽象类，通用的属性和方法
 * </p>
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/18 14:41
 */
public abstract class Root {

    private String name;

    public Root(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void addFile(Root root);

    public abstract void removeFile(Root root);

    public abstract void display(int depth);
}
