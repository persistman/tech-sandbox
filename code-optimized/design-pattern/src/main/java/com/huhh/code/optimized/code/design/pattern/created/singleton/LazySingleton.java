package com.huhh.code.optimized.code.design.pattern.created.singleton;

/**
 *  懒汉模式， 只在使用的是创建
 * 
 *   存在线程安全问题
 */
public class LazySingleton {


    private static LazySingleton instance;


    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        return null == instance ? new LazySingleton() : instance;
    }


}
