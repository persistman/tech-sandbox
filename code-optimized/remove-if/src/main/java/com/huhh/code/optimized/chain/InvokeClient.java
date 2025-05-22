package com.huhh.code.optimized.chain;

import com.huhh.code.optimized.chain.handler.AliPayHandler;
import com.huhh.code.optimized.chain.handler.PayTypeHandler;
import com.huhh.code.optimized.chain.handler.WeChatPayHandler;
import com.huhh.code.optimized.pay.PayContext;
import com.huhh.code.optimized.pay.PayConstant.PayType;


/**
 *  the client is where user invoke the pay action by pay type
 * 
 *  这是在实际应用中，通过支付类型，来执行相应的功能的地方。
 */
public class InvokeClient {

    private static PayTypeHandler payChain;

    static {
        // Setup the chain of responsibility
        AliPayHandler aliPayHandler = new AliPayHandler();
        WeChatPayHandler weChatPayHandler = new WeChatPayHandler();

        aliPayHandler.setNext(weChatPayHandler);
        // Add more handlers here and link them similarly
        // e.g., weChatPayHandler.setNext(anotherPayHandler);

        payChain = aliPayHandler; // The head of the chain
    }


    public static void processPayment(PayContext context) {
        if (payChain == null) {
            throw new IllegalStateException("Payment chain not initialized.");
        }
        payChain.handle(context);
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
