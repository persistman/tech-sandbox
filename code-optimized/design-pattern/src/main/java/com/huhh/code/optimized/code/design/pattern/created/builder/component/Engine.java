package com.huhh.code.optimized.code.design.pattern.created.builder.component;

import lombok.Data;

/**
 * 辅助类： 发动机
 * 不属于构造者模式的一部分，属于构造者中创建对象的一部分
 */
@Data
public class Engine {

    /**
     *  发动机牌子
     */
    private String name;

    /**
     *  发动机马力
     */
    private int power;
}
