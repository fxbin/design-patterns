package cn.fxbin.learn.builder;

/**
 * Builder
 *
 * <p>
 *     声明建造者的公共方法
 * </p>
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/7 13:54
 */
public interface Builder {

    void buildCpu();

    void buildMainboard();

    void buildDisk();

    void buildPower();

    void buildMemory();

    Computer createComputer();

}
