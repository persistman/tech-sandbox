package com.huhh.code.optimized.code.design.pattern.created.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 *  实体类，在使用的时候克隆
 */

public class User implements Cloneable {

    @Getter
    @Setter
    private String name = "zhangsan";


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object object) {
        if(null == object) {
            return false;
        }

        if(object instanceof User) {
            User user = (User) object;
            return name.equals(user.name);
        }

        return false;
    }


}