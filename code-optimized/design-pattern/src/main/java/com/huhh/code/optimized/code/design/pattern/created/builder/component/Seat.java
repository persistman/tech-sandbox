package com.huhh.code.optimized.code.design.pattern.created.builder.component;

import lombok.Data;

/**
 * 辅助类： 座椅
 * 不属于构造者模式的一部分，属于构造者中创建对象的一部分
 */
@Data
public class Seat {

    /**
     *  座椅类型
     */
    private String type;

    /**
     * 座椅大小
     */
    private int size;

}
