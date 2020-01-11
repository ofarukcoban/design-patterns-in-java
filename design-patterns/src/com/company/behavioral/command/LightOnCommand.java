package com.company.behavioral.command;

/**
 * Created by omerfarukcoban on 26.12.2019.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
