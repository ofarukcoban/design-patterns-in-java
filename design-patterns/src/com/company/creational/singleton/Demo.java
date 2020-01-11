package com.company.creational.singleton;

/**
 * Created by omerfarukcoban on 1.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("Hello");
        Singleton singleton1 = Singleton.getInstance("Hii");

        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }
}
