package com.company.creational.factory.logistic;

import com.company.creational.factory.transport.RoadTransport;
import com.company.creational.factory.transport.Transport;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class RoadLogistic extends Logistic {
    @Override
    public Transport createTransport() {
        return new RoadTransport();
    }
}
