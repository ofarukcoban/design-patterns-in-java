package com.company.creational.factory.transport;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class RoadTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("road transport");
    }
}
