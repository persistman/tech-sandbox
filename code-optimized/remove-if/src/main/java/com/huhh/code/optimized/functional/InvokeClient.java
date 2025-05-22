package com.huhh.code.optimized.functional;

import com.huhh.code.optimized.pay.PayConstant.PayType;
import com.huhh.code.optimized.pay.PayContext;

/**
 *  the client is where user invoke the pay action by pay type
 * 
 *  这是在实际应用中，通过支付类型，来执行相应的功能的地方。
 */
public class InvokeClient {

    public static void processPayment(PayContext context) {

        PayActionFunction action;
       try {
            action = PayActionFactory.getPayAction(context.getPayType());
       } catch(UnsupportedOperationException e) {
            // Log the exception or handle it as needed, then rethrow or throw a custom exception
            System.err.println("Error in processPayment: " + e.getMessage());
            throw e; // Re-throwing the original exception
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
