package cn.fxbin.learn.chain.pay_risk;

/**
 * Request
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 15:10
 */
public class Request {

    /**
     * 类别
     */
    private String requestType;

    /**
     * 金额
     */
    private int money;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
