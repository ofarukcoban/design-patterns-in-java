package com.company.behavioral.mediator;

/**
 * Created by omerfarukcoban on 27.12.2019.
 */
public class User {

    private String name;
    private Mediator mediator;

    public User( Mediator mediator, String name) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        mediator.send(this, message);
    }
}
