package com.huhh.code.optimized.code.design.pattern.created.factory.method;


/**
 *  Client 为客户端类， 客户端不需要具体的产品信息
 *  但是知道有哪些产品工厂
 * 
 *  具体的产品有工厂来生产。
 */
public class Client {

    public static void main(String[] args) {
        //创建具体产品工厂
        Factory factory = new CorrectAProductFactory();
        // 通过工厂来生产产品
        Product product = factory.create();
        // 产品的具体行为
        product.dispaly();
    }
}
