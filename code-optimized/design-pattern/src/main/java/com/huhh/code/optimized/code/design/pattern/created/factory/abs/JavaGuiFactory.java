package com.huhh.code.optimized.code.design.pattern.created.factory.abs;

/**
 *  Java 的GUI实现，包含多个相关连的实体相关类，包含但不限于 Button， TextBox
 */
public class JavaGuiFactory extends GuiFactory {

    @Override
    public Button drawButton() {
        return new JavaButton();
    }

    @Override
    public TextBox drawTextBox() {
        return new JavaTextBox();
    }

}
