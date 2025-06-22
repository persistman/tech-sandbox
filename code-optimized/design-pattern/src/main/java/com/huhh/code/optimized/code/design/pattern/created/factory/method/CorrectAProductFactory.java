package com.huhh.code.optimized.code.design.pattern.created.factory.method;

/**
 *  定义 CorrectAProduct 的工厂类
 *  只负责 CorrectAProduct 产品的生产
 */
public class CorrectAProductFactory implements Factory{

    @Override
    public Product create() {
        return new CorrectAProduct();
    }

}
