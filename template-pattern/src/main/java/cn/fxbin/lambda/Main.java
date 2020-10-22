package cn.fxbin.lambda;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/10/22 17:08
 */
public class Main {

    public static void main(String[] args) {

        new LambdaOnlineBanking().processCustomer(1234, (Customer c) -> System.out.println("hhh"));

    }

}
