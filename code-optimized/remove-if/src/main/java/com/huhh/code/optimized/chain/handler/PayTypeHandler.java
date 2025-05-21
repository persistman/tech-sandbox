package com.huhh.code.optimized.chain.handler;

import com.huhh.code.optimized.chain.pay.PayConstant.PayType;
import com.huhh.code.optimized.chain.pay.PayContext;

public abstract class PayTypeHandler {

    public abstract PayType getPayType();


    public void handle(PayContext context) {
        if(this.getPayType().equals(context.getPayType())) {
            this.action();
        }
    }


    protected void action() {
        throw new UnsupportedOperationException("this function not suport!");
    }


}
