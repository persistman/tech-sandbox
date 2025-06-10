package com.huhh.code.optimized.code.design.pattern.created.singleton;

/**
 *  线程安全的懒汉模式
 * 基于 Double Check
 */
public class SafeLazySingleton {

    private static volatile SafeLazySingleton instance;


    private SafeLazySingleton() {

    }

    public static SafeLazySingleton getInstance() {
        if(null == instance) {
            synchronized(SafeLazySingleton.class) {
                if(null == instance) {
                    instance = new SafeLazySingleton();
                }
            }
        }
        return instance;
    }

}
