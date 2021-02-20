package cn.fxbin.learn.chain.pay_risk;

/**
 * FirstRiskControlManager
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 15:17
 */
public class FirstRiskControlManager extends RiskControlManager {
    public FirstRiskControlManager(String name) {
        super(name);
    }

    /**
     * 1000 以内
     * @param request cn.fxbin.learn.chain.pay.Request
     */
    @Override
    public void handleRequest(Request request) {
        RequestType.valueOf(request.getRequestType());
        if(request.getMoney()<=1000){

            System.out.println("普通操作，输入支付密码即可");

            System.out.println(name+":"+request.getRequestType() + ", 金额:"+request.getMoney() +" 处理完成");

        }else {

            //下个节点进行处理
            if(superior!=null){
                superior.handleRequest(request);
            }
        }

    }
}
