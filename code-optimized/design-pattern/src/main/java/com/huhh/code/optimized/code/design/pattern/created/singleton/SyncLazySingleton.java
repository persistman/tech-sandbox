package com.huhh.code.optimized.code.design.pattern.created.singleton;

/**
 * 通过同步方法实现 懒汉模式
 */
public class SyncLazySingleton {

    private static SyncLazySingleton instance;

    private SyncLazySingleton() {

    }

    public static synchronized SyncLazySingleton getInstance() {

        if(null == instance) {
            instance = new SyncLazySingleton();
        }

        return instance;
    }

}
