package com.company.behavioral.state;

/**
 * Created by omerfarukcoban on 29.12.2019.
 */
public class Demo {
    public static void main(String[] args) {

        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        StopState stopState = new StopState();
        stopState.doAction(context);
    }
}
