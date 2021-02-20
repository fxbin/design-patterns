package cn.fxbin.learn.chain.pay_risk;

/**
 * ThirdRiskControlManager
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 15:17
 */
public class ThirdRiskControlManager extends RiskControlManager {
    public ThirdRiskControlManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        RequestType.valueOf(request.getRequestType());
        if(request.getMoney() > 10000){

            System.out.println("大额操作，输入支付密码+验证码+人脸识别 ");

            System.out.println(name+":"+request.getRequestType() + ", 金额:"+request.getMoney() +" 处理完成");

        }else {

            //下个节点进行处理
            if(superior!=null){
                superior.handleRequest(request);
            }
        }
    }
}
