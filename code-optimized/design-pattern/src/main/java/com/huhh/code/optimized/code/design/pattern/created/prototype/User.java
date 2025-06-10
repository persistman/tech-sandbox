package com.huhh.code.optimized.code.design.pattern.created.prototype;

import lombok.Data;

/**
 *  实体类，在使用的时候克隆
 */
@Data
public class User implements Cloneable {

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