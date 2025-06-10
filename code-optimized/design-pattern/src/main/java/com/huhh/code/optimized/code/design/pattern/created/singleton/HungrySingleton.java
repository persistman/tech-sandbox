package com.huhh.code.optimized.code.design.pattern.created.singleton;
/**
 *  饿汉模式， 提前创建完成。
 *  这种到可能导致大量无用的类，导致程序启动缓慢，或者占用大量空间
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

}
