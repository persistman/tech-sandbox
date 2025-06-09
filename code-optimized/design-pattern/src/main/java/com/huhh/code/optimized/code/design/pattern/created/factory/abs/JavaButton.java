package com.huhh.code.optimized.code.design.pattern.created.factory.abs;

/**
 *  Button 行为， Java 语言的实现
 */
public class JavaButton extends Button {

    @Override
    public void click() {
        System.out.println("new java.awt.Button('Submit')");
    }


}
