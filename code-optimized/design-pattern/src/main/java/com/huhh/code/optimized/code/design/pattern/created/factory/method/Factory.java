package com.huhh.code.optimized.code.design.pattern.created.factory.method;

/**
 *  产品工厂的定义
 * 
 *  定义生产产品， 但具体要生产什么同类型的产品具体产品，还需要实现具体实现
 */
public interface Factory {

    Product create();

}
