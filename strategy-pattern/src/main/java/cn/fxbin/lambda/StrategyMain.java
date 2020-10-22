package cn.fxbin.lambda;

/**
 * StrategyMain
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/10/22 16:55
 */
public class StrategyMain {

    public static void main(String[] args) {
        // 原生方式
        Validator v1 = new Validator(new IsNumeric());
        System.out.println(v1.validate("aaaa"));
        Validator v2 = new Validator(new IsAllLowerCase ());
        System.out.println(v2.validate("bbbb"));

        // with lambdas
        Validator v3 = new Validator((String s) -> s.matches("\\d+"));
        System.out.println(v3.validate("aaaa"));
        Validator v4 = new Validator((String s) -> s.matches("[a-z]+"));
        System.out.println(v4.validate("bbbb"));
    }

}
