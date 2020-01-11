package com.company.creational.factory.logistic;

import com.company.creational.factory.transport.Transport;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public abstract class Logistic {

    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}
