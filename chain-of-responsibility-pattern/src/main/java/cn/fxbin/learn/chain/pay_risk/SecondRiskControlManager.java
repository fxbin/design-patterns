package cn.fxbin.learn.chain.pay_risk;

/**
 * SecondRiskControlManager
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 15:17
 */
public class SecondRiskControlManager extends RiskControlManager {

    public SecondRiskControlManager(String name) {
        super(name);
    }

    /**
     * 处理 1千到1万之间
     * @param request cn.fxbin.learn.chain.pay.Request
     */
    @Override
    public void handleRequest(Request request) {
        RequestType.valueOf(request.getRequestType());
        if(request.getMoney()>1000 && request.getMoney() <= 10000){

            System.out.println("稍大额操作，输入支付密码+短信验证码即可");

            System.out.println(name+":"+request.getRequestType() + ", 金额:"+request.getMoney() +" 处理完成");

        }else {

            //下个节点进行处理
            if(superior!=null){
                superior.handleRequest(request);
            }
        }

    }
}
