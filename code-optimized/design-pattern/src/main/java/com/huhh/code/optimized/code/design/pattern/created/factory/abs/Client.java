package com.huhh.code.optimized.code.design.pattern.created.factory.abs;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

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
