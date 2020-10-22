package cn.fxbin.lambda;

/**
 * OnlineBanking
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/10/22 17:04
 */
public abstract class OnlineBanking {

    public void processCustomer(int id){
        Customer c = Database.getCustomerWithId(id);
        makeCustomerHappy(c);
    }

    abstract void makeCustomerHappy(Customer c);

}
