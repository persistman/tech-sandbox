package com.huhh.code.optimized.code.design.pattern.created.singleton;
/**
 *  最常用方式，静态内部类方式创建
 */
public class InnerStaticClassSingleton {

    private InnerStaticClassSingleton() {

    }

    static final class InnerClass {
        private static final InnerStaticClassSingleton INSTANCE = new InnerStaticClassSingleton();
    }


    public static InnerStaticClassSingleton getInstance() {
        return InnerClass.INSTANCE;
    }
}
