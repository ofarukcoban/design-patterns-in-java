package com.company.behavioral.command;

/**
 * Created by omerfarukcoban on 26.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        Light light = new Light();
        Command onCommand = new LightOnCommand(light);
        RemoteControl remoteControl = new RemoteControl(onCommand);
        remoteControl.pressButton();

        System.out.println(light.toString());
    }
}
