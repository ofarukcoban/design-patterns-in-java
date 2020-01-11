package com.company.behavioral.strategy;


/**
 * Created by omerfarukcoban on 29.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        PayByCreditCard payByCreditCard = new PayByCreditCard();
        Context context = new Context(payByCreditCard);
        context.executePayStrategy(100.0);
    }
}
