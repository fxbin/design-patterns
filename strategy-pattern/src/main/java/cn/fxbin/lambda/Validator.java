package cn.fxbin.lambda;

/**
 * Validator
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/10/22 16:56
 */
public class Validator {

    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String s){
        return strategy.execute(s);
    }
}
