package com.company.behavioral.strategy;

/**
 * Created by omerfarukcoban on 30.12.2019.
 */
public class Context {

    private PayStrategy payStrategy;

    public Context(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void executePayStrategy(double paymentAmount){
        payStrategy.pay(paymentAmount);
    }
}
