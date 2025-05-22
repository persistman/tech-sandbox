package com.huhh.code.optimized.chain;

import com.huhh.code.optimized.chain.handler.AliPayHandler;
import com.huhh.code.optimized.chain.handler.PayTypeHandler;
import com.huhh.code.optimized.chain.handler.WeChatPayHandler;
import com.huhh.code.optimized.chain.pay.PayContext;
import com.huhh.code.optimized.chain.pay.PayConstant.PayType;

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
