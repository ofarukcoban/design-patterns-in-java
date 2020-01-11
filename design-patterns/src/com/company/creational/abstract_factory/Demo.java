package com.company.creational.abstract_factory;

import com.company.creational.abstract_factory.factory.MacFactory;
import com.company.creational.abstract_factory.factory.WinFactory;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class Demo {

    public static Application application;

    public static void main(String[] args) {
        configure();
        paint();
    }

    private static void configure(){

        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")){
            application = new Application(new MacFactory());
        } else{
            application = new Application(new WinFactory());
        }
    }

    private static void paint(){
        application.paint();
    }
}
