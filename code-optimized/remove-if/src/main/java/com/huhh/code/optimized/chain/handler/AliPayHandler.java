package com.huhh.code.optimized.chain.handler;

import com.huhh.code.optimized.chain.pay.PayConstant.PayType;

public class AliPayHandler extends PayTypeHandler {

    @Override
    public PayType getPayType() {
        return PayType.ALI_PAY;
    }



    @Override
    public void action() {
        System.out.println("Ali pay action....");
    }




    

}
