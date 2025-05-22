package com.huhh.code.optimized.enums;

public class InvokeClient {

    public static void processPayment(PayContext context) {
        PayTypeEnum payType = context.getPayType();

        if(null == payType) {
            throw new UnsupportedOperationException("pay type not support....");
        }

        payType.action();
    }




    public static void main(String[] args) {
        PayContext context = new PayContext();
        context.setPayType(PayTypeEnum.ALI_PAY);
        processPayment(context);

        PayContext wechatCnxt = new PayContext();          
        wechatCnxt.setPayType(PayTypeEnum.WE_CHAT_PAY);
        processPayment(wechatCnxt);
    }

}

class PayContext {
    private PayTypeEnum payType;


    public void setPayType(PayTypeEnum payType) {
        this.payType = payType;
    }


    public PayTypeEnum getPayType() {
        return this.payType;
    }
}

