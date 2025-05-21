package com.huhh.code.optimized.chain.pay;

import com.huhh.code.optimized.chain.pay.PayConstant.PayType;

public class PayContext {

    private PayType payType;


    public PayType getPayType() {
        return this.payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }
}
