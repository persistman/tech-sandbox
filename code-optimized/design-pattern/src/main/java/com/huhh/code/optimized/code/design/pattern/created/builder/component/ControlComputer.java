package com.huhh.code.optimized.code.design.pattern.created.builder.component;

import lombok.Data;

/**
 * 辅助类： 中控电脑
 * 不属于构造者模式的一部分，属于构造者中创建对象的一部分
 */
@Data
public class ControlComputer {

    /**
     *  牌子
     */
    private String name;

    /**
     *  大小
     */
    private int size;

}
