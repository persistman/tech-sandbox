package com.huhh.code.optimized.code.design.pattern.created.factory.abs;

public class HtmlButton extends Button{

    @Override
    public void click() {
       System.out.println("<input type='submit' name='Submit'>");
    }

}
