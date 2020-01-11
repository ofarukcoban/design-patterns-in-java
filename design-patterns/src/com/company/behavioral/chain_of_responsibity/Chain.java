package com.company.behavioral.chain_of_responsibity;

/**
 * Created by omerfarukcoban on 25.12.2019.
 */
public interface Chain {
    void setNext(Chain nextInChain);
    void process(Number request);
}
