package com.huhh.code.optimized;

import com.huhh.code.optimized.chain.pay.PayContext;
import com.huhh.code.optimized.chain.pay.PayConstant.PayType;

/**
 *  The class is default implement. there were so many if-else branches to judge
 *  and the every branch had its own logic action.
 *  so that the class was so big and hard to underatand to what it to do！
 * 
 * 
 *  这个类是在开发过程使用大量的if-else 来做判断的默认实现， 可以知道大量的if-else 判断会使得这个函数变的很大，
 *  可阅读性也比较差，无法维护和重用
 * 
 * 
 *  It was we need to optimize.
 * 
 *  这也是后面我们需要优化的最原始的地方。
 */
public class DefaultImplement {


    public static void main(String[] args) {

        /**
         *  In fact, the context is passed by other method or as a paramter
         *  This case, I created the context directly, but you could pretend not to know。
         * 
         *  实际上，这个支付上下文是通过参数或者函数调用返回， 不知道具体的支付类型是什么。这里为了方便，直接
         *  创建了一个支付上下文， 你可以当作不知道，就当这个上下文是从别的地方传递过来的，也不知道它的支付类型是什么，
         *  那么就只能通过if-else 来逐个判断了。
         *  
         */
        PayContext context = new PayContext();
        context.setPayType(PayType.ALI_PAY);

        if(PayType.ALI_PAY.equals(context.getPayType())) {
            System.out.println("Ali pay action...");
        } else if(PayType.WE_CHAT_PAY.equals(context.getPayType())) {
            System.out.println("WeChat pay action...");
        } else {
            throw new UnsupportedOperationException("this pay type not support");
        }
    }

}
