package com.huhh.code.optimized.code.design.pattern.created.singleton;

/**
 *  基于ThreadLocal来实现
 *  比较常见的用法是，SimpleDateFormat 做线程安全处理方案之一的使用
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton() {

    }

    public static ThreadLocalSingleton getInstance() {
        return THREAD_LOCAL.get();
    }

}
