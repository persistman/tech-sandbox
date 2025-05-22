package com.huhh.code.optimized.strategy;

import com.huhh.code.optimized.pay.PayConstant;

/**
 * If you introduce Spring dependencies, you can hand over the Strategy to the Spring container for management; 
 * currently no Spring related dependencies are introduced, 
 * so the singleton mode is used here to create objects.
 * 
 * 如果引入Spring 可以将Strategy 交给Spring 容器管理；
 * 当前没有引入 Spring 相关依赖， 所以在这里使用单例模式创建对象
 */
public class WeChatPayStrategy implements PayStrategy {

    private static final WeChatPayStrategy INSTANCE  = new WeChatPayStrategy();

    static {
        PayStrategyFactory.addStragtegy(PayConstant.PayType.WE_CHAT_PAY, INSTANCE);
    }

    private WeChatPayStrategy() {
        
    }


    @Override
    public void action() {
        System.out.println("Wechat pay action...");
        
    }


    public static WeChatPayStrategy getInstance() {
        return INSTANCE;
    }




}
