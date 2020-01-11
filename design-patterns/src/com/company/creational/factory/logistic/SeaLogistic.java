package com.company.creational.factory.logistic;

import com.company.creational.factory.transport.SeaTransport;
import com.company.creational.factory.transport.Transport;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class SeaLogistic extends Logistic {
    @Override
    public Transport createTransport() {
        return new SeaTransport();
    }
}
