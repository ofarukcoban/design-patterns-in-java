package com.company.behavioral.state;

/**
 * Created by omerfarukcoban on 29.12.2019.
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("started");
        context.setState(this);
    }
}
