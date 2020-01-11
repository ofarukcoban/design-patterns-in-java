package com.company.behavioral.strategy;

/**
 * Created by omerfarukcoban on 30.12.2019.
 */
public class PayByAccount implements PayStrategy {
    @Override
    public void pay(double paymentAmount) {
        System.out.println(paymentAmount + " - paid by account");
    }
}
