package com.huhh.code.optimized.chain.handler;

import com.huhh.code.optimized.chain.pay.PayConstant.PayType;
import com.huhh.code.optimized.chain.pay.PayContext;

public abstract class PayTypeHandler {

    protected PayTypeHandler next;

    public abstract PayType getPayType();

    public void setNext(PayTypeHandler nextHandler) {
        this.next = nextHandler;
    }

    public void handle(PayContext context) {
        if(this.getPayType().equals(context.getPayType())) {
            this.action();
        } else if (this.next != null) {
            this.next.handle(context);
        } else {
            throw new UnsupportedOperationException("No handler found for pay type: " + context.getPayType());
        }
    }


    protected void action() {
        throw new UnsupportedOperationException("this function not suport!");
    }


}
