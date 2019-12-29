package cn.fxbin.strategy.pay.controller;

import cn.fxbin.strategy.pay.context.PayStrategyContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * PayController
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/12/29 22:29
 */
@RequestMapping
public class PayController {

    @Resource
    private PayStrategyContext payStrategyContext;

    @GetMapping("/pay")
    public String pay(String payCode){
        return payStrategyContext.getStrategy(payCode).pay();
    }

}
