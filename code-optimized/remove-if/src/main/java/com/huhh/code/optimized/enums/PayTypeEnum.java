package com.huhh.code.optimized.enums;

public enum PayTypeEnum implements PayAction{
    ALI_PAY {
        @Override
        public void action() {
            System.out.println("ali pay action....");
        } 
    },

    WE_CHAT_PAY {

        @Override
        public void action() {
            System.out.println("wechat pay action....");
        }

    };

}
