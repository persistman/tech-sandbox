package com.huhh.code.optimized.code.design.pattern.created.factory.abs;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *  访问客户端
 * 这里的通过配置的方式读取道使用的语言，然后根据语言来创建对应的工厂类
 * 
 */
public class Client {

    public static void main(String[] args) throws Exception {

        try(InputStream is = Client.class.getResourceAsStream("gui-factory.conf");
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            ) {
            String str = reader.readLine();
            String language = str == null ? "Java" : str.split("=")[1];
            GuiFactory factory = new HtmlGuiFactory();
            if("java".equalsIgnoreCase(language)) {
                factory = new JavaGuiFactory();
            }
            factory.drawButton().click();
            factory.drawTextBox().input();
        }
        
    }

}
