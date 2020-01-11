package com.company.behavioral.chain_of_responsibity;

/**
 * Created by omerfarukcoban on 25.12.2019.
 */
public class ZeroProcessor implements Chain {

    private  Chain nextInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(Number request) {

        if(request != null && request.getValue() == 0){
            System.out.println("Zero: " + request.getValue());
        }else{
            nextInChain.process(request);
        }
    }
}
