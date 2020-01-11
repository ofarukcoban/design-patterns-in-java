package com.company.structural.proxy;

/**
 * Created by omerfarukcoban on 9.12.2019.
 */
public class RealService implements Service {

    @Override
    public void someOperation() {
        System.out.println("Proxy pattern is working");
    }
}
