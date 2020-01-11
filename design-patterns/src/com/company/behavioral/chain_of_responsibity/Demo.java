package com.company.behavioral.chain_of_responsibity;

/**
 * Created by omerfarukcoban on 25.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        Chain c1 = new NegativeProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveProcessor();
        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(new Number(90));
        c1.process(new Number(-50));
        c1.process(new Number(0));
        c1.process(new Number(91));
    }
}
