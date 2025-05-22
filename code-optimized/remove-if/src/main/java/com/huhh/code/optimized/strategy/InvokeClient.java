package com.huhh.code.optimized.strategy;

import com.huhh.code.optimized.pay.PayConstant;
import com.huhh.code.optimized.pay.PayContext;

/**
 *  the client is where user invoke the pay action by pay type
 * 
 *  这是在实际应用中，通过支付类型，来执行相应的功能的地方。
 */
public class InvokeClient {


    public static void processPayment(PayContext context) {
        PayStrategy strategy = null;
        try {
            strategy = PayStrategyFactory.getPayStrategy(context.getPayType());
        } catch(Exception e) {
            throw new UnsupportedOperationException(context.getPayType() + " not support the pay type...");
        }
        

        if (strategy == null) {
            throw new IllegalStateException("Payment chain not initialized...");
        }

        strategy.action();
    }


    public static void main(String[] args) {
        PayContext context = new PayContext();
        context.setPayType(PayConstant.PayType.ALI_PAY);
        processPayment(context);

        PayContext wechatCnxt = new PayContext();          
        wechatCnxt.setPayType(PayConstant.PayType.WE_CHAT_PAY);
        processPayment(wechatCnxt);
    }

}
