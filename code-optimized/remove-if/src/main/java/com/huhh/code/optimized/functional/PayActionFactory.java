package com.huhh.code.optimized.functional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.huhh.code.optimized.pay.PayConstant;

public class PayActionFactory {


    private static final Map<PayConstant.PayType, PayActionFunction> PAY_MAP = new HashMap<>(12);


    static  {
        PAY_MAP.put(PayConstant.PayType.ALI_PAY, () -> System.out.println("ali pay action..."));
        PAY_MAP.put(PayConstant.PayType.WE_CHAT_PAY, () -> System.out.println("wechat pay action..."));
    }
 
    private PayActionFactory() {}

    
    public static PayActionFunction getPayAction(PayConstant.PayType payType) {
        return Optional.ofNullable(PAY_MAP.get(payType))
            .orElseThrow(() -> new UnsupportedOperationException("Pay type not supported: " + payType));
    }
    


}
