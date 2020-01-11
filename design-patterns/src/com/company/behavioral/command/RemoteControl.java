package com.company.behavioral.command;

/**
 * Created by omerfarukcoban on 26.12.2019.
 */
public class RemoteControl {

    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
