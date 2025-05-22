package com.huhh.code.optimized.chain.handler;

import com.huhh.code.optimized.pay.PayConstant.PayType;

public class WeChatPayHandler extends PayTypeHandler {

    @Override
    public PayType getPayType() {
        return PayType.WE_CHAT_PAY;
    }

    @Override
    public void action() {
        System.out.println("WeChat pay action....");
    }

}
