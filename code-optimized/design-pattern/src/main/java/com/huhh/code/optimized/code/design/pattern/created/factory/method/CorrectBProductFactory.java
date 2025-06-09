package com.huhh.code.optimized.code.design.pattern.created.factory.method;

/**
 *  定义 CorrectBProduct 的工厂类
 *  只负责 CorrectBProduct 产品的生产
 */
public class CorrectBProductFactory implements Factory {

    @Override
    public Product create() {
        // TODO Auto-generated method stub
        return new CorrectBProduct();
    }

}
