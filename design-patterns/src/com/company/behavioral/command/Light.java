package com.company.behavioral.command;

/**
 * Created by omerfarukcoban on 26.12.2019.
 */
public class Light {

    private boolean status;

    public void switchOn() {
        status = true;
    }

    public void switchOff() {
        status = false;
    }

    @Override
    public String toString() {
        return "Light{" +
                "status=" + status +
                '}';
    }
}
