package com.company.behavioral.mediator;

import java.time.LocalDateTime;

/**
 * Created by omerfarukcoban on 27.12.2019.
 */
public class ChatRoom implements Mediator {

    @Override
    public void send(User user, String message) {
        System.out.println(LocalDateTime.now().toString() + " - " +  user.getName() + ": " + message);
    }
}
