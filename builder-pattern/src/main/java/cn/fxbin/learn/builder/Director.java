package cn.fxbin.learn.builder;

/**
 * Director
 *
 * <p>
 *     将产品和创建过程进行解耦，使用相同的创建过程创建不同的产品，控制产品生产过程；
 *     Director 是全程知道组装过程，具体的细节由builder 去操作
 * </p>
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/7 13:58
 */
public class Director {

    public Computer create(Builder builder) {
        builder.buildCpu();
        builder.buildDisk();
        builder.buildMainboard();
        builder.buildPower();
        builder.buildMemory();
        return builder.createComputer();
    }

}
