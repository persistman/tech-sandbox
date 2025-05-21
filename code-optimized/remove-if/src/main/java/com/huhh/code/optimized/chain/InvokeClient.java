package com.huhh.code.optimized.chain;

import java.util.ArrayList;
import java.util.List;

import com.huhh.code.optimized.chain.handler.AliPayHandler;
import com.huhh.code.optimized.chain.handler.PayTypeHandler;
import com.huhh.code.optimized.chain.handler.WeChatPayHandler;
import com.huhh.code.optimized.chain.pay.PayContext;
import com.huhh.code.optimized.chain.pay.PayConstant.PayType;

public class InvokeClient {

    private static final List<PayTypeHandler> payHandlerList;

    static {
        payHandlerList = new ArrayList<>();
        payHandlerList.add(new AliPayHandler());
        payHandlerList.add(new WeChatPayHandler());
    }


    public static void main(String[] args) {
        PayContext context = new PayContext();
        context.setPayType(PayType.ALI_PAY);
        payHandlerList.forEach(handler -> handler.handle(context));
    }

}
