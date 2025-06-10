package com.huhh.code.optimized.code.design.pattern.created.prototype;

/**
 * @Date: 2025-06-10 21:20
 * @Author: persistman
 * @Description: 客户端应用
 **/
public class Client {

    public static void main(String[] args) throws  Exception {
        User user = new User();
        User cloneUser = (User) user.clone();
        System.out.println(user);
        System.out.println(cloneUser);
    }
}
