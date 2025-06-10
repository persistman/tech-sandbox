package com.huhh.code.optimized.code.design.pattern.created.singleton;
/**
 *  通过 AtomicReference 类帮助实现
 *  底层是通过 CAS 来实现
 */

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceSingleton { 
    private static final AtomicReference<AtomicReferenceSingleton> INSTANCE = new AtomicReference<>();

    private AtomicReferenceSingleton() {

    }

    public static AtomicReferenceSingleton getInstance() {

        while(true) {
            AtomicReferenceSingleton instance = INSTANCE.get();
            if(null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new AtomicReferenceSingleton());
            return INSTANCE.get();
        }
    }

}
