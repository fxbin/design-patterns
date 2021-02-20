package cn.fxbin.learn.chain.pay_risk;

/**
 * Main
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 15:29
 */
public class Main {

    public static void main(String[] args) {

        RiskControlManager firstControlManager = new FirstRiskControlManager("初级风控");
        RiskControlManager secondControlManager = new SecondRiskControlManager("中级风控");
        RiskControlManager thirdControlManager = new ThirdRiskControlManager("高级风控");

        // 调用链关系配置
        firstControlManager.setSuperior(secondControlManager);
        secondControlManager.setSuperior(thirdControlManager);


        // 使用
        Request request = new Request();
        request.setRequestType(RequestType.CASH_OUT.name());
        request.setMoney(20000);
        firstControlManager.handleRequest(request);

    }

}
