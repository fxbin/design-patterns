package cn.fxbin.lambda;

/**
 * IsAllLowerCase
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/10/22 16:55
 */
public class IsAllLowerCase implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
