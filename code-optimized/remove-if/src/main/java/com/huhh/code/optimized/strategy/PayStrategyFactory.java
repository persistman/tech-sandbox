package com.huhh.code.optimized.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.huhh.code.optimized.pay.PayConstant;

public class PayStrategyFactory {

    private static final Map<PayConstant.PayType, PayStrategy> PAY_TOOLS_MAP = new HashMap<>(10);


    public static void addStragtegy(PayConstant.PayType payType, PayStrategy payStrategy) {
        PAY_TOOLS_MAP.putIfAbsent(payType, payStrategy);
    }


    public static PayStrategy getPayStrategy(PayConstant.PayType payType) {
       return Optional.ofNullable(PAY_TOOLS_MAP.get(payType)).orElseThrow(() -> new UnsupportedOperationException("Pay type not supported: " + payType)); 
    }

}
