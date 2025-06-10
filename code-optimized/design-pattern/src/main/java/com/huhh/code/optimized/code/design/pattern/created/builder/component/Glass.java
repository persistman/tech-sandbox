package com.huhh.code.optimized.code.design.pattern.created.builder.component;

import lombok.Data;

/**
 * 辅助类： 汽车玻璃
 * 不属于构造者模式的一部分，属于构造者中创建对象的一部分
 */
@Data
public class Glass {

    private String name;

    private boolean visible;

}
