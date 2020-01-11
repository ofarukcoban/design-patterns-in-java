package com.company.structural.proxy;

import java.util.Optional;

/**
 * Created by omerfarukcoban on 9.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        RealService service = new RealService();
        ProxyService proxy = new ProxyService(service);
        proxy.someOperation();

    }
}
