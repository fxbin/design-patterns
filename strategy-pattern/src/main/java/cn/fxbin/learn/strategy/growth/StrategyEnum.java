package cn.fxbin.learn.strategy.growth;

/**
 * StrategyEnum
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:07
 */
public enum StrategyEnum {

    /**
     * A
     */
    A("cn.fxbin.learn.strategy.growth.AStrategy"),

    /**
     * B
     */
    B("cn.fxbin.learn.strategy.growth.BStrategy"),

    /**
     * C
     */
    C("cn.fxbin.learn.strategy.growth.CStrategy"),

    /**
     * D
     */
    D("cn.fxbin.learn.strategy.growth.DStrategy"),
    ;

    private String className;

    StrategyEnum(String className){
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

}
