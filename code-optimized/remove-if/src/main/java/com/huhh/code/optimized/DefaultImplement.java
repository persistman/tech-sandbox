package com.huhh.code.optimized;

import com.huhh.code.optimized.chain.pay.PayContext;
import com.huhh.code.optimized.chain.pay.PayConstant.PayType;

public class DefaultImplement {


    public static void main(String[] args) {
        PayContext context = new PayContext();
        context.setPayType(PayType.ALI_PAY);

        if(PayType.ALI_PAY.equals(context.getPayType())) {
            System.out.println("Ali pay action...");
        } else if(PayType.WE_CHAT_PAY.equals(context.getPayType())) {
            System.out.println("WeChat pay action...");
        } else {
            throw new UnsupportedOperationException("this pay type not support");
        }
    }

}
