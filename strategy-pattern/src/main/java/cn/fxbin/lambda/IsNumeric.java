package cn.fxbin.lambda;

/**
 * IsNumeric
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/10/22 16:56
 */
public class IsNumeric implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
