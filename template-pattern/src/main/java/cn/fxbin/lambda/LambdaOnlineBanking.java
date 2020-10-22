package cn.fxbin.lambda;

import java.util.function.Consumer;

/**
 * LambdaOnlineBanking
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/10/22 17:07
 */
public class LambdaOnlineBanking {

    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy){
        Customer c = Database.getCustomerWithId(id);
        makeCustomerHappy.accept(c);
    }

}
