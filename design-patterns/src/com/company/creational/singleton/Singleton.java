package com.company.creational.singleton;

/**
 * Created by omerfarukcoban on 1.12.2019.
 */
public class Singleton {

    private static volatile Singleton obj;
    private String value;

    private Singleton() {
    }

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value){

        if(obj == null){
            synchronized (Singleton.class){
                if(obj == null)
                    obj = new Singleton(value);
            }
        }
        return obj;
    }

    public String getValue() {
        return value;
    }
}
