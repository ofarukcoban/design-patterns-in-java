package com.company.behavioral.command;

/**
 * Created by omerfarukcoban on 26.12.2019.
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

        light.switchOff();
    }
}
