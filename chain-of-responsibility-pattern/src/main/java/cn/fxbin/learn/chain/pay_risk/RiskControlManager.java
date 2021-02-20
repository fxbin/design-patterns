package cn.fxbin.learn.chain.pay_risk;

/**
 * RiskControlManager
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 15:11
 */
public abstract class RiskControlManager {

    protected String name;

    /**
     * 更严格的风控策略
     */
    protected RiskControlManager superior;

    public RiskControlManager(String name) {
        this.name = name;
    }

    /**
     * 设置更严格的风控策略
     * @param superior cn.fxbin.learn.chain.pay.RiskControlManager
     */
    public void setSuperior(RiskControlManager superior) {
        this.superior = superior;
    }

    /**
     * 处理请求
     * @param request cn.fxbin.learn.chain.pay.Request
     */
    public abstract void handleRequest(Request request);

}
