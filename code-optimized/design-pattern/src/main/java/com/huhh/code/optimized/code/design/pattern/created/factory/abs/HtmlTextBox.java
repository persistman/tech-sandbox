package com.huhh.code.optimized.code.design.pattern.created.factory.abs;

/**
 *  Html 实现TextBox
 */
public class HtmlTextBox extends TextBox {

    @Override
    public void input() {
        // TODO Auto-generated method stub
        System.out.println("<input type='text' placehodler='pls input name...'>");
    }

}
