package com.company.behavioral.mediator;

/**
 * Created by omerfarukcoban on 27.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        Mediator chatroom = new ChatRoom();
        User user1 = new User(chatroom, "Alex");
        User user2 = new User(chatroom, "Brian");
        User user3 = new User(chatroom, "Charles");

        user1.sendMessage("Slm");
        user2.sendMessage("Hello");
        user3.sendMessage("Hiiii");
    }
}
