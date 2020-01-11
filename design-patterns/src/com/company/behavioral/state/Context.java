package com.company.behavioral.state;

/**
 * Created by omerfarukcoban on 29.12.2019.
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
