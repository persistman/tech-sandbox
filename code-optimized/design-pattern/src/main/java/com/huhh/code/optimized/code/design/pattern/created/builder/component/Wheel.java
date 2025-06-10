package com.huhh.code.optimized.code.design.pattern.created.builder.component;

import lombok.Data;

/**
 * 辅助类： 轮胎
 * 不属于构造者模式的一部分，属于构造者中创建对象的一部分
 */
@Data
public class Wheel {

    /**
     *  轮胎品牌
     */
    private String name;

    /**
     *  轮胎大小
     */
    private int size;
}
