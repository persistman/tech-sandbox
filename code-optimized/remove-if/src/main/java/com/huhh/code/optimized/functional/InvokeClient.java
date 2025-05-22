package com.huhh.code.optimized.functional;

import com.huhh.code.optimized.pay.PayConstant.PayType;
import com.huhh.code.optimized.pay.PayContext;

public class InvokeClient {

    public static void processPayment(PayContext context) {

        PayActionFunction action = null;
       try {
            action = PayActionFactory.getPayAction(context.getPayType());
       } catch(Exception e) {
            throw new UnsupportedOperationException("pay type not support...");
       }
        action.action();
    }


    public static void main(String[] args) {
        PayContext context = new PayContext();
        context.setPayType(PayType.ALI_PAY); // Test with AliPay
        processPayment(context);

        PayContext context2 = new PayContext();
        context2.setPayType(PayType.WE_CHAT_PAY); // Test with WeChatPay
        processPayment(context2);
    }

}
