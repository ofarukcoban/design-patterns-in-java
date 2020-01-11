package com.company.behavioral.memento;

/**
 * Created by omerfarukcoban on 29.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state-1");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("state-2");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("state-3");
        careTaker.addMemento(originator.saveStateToMemento());

        System.out.println("origin    " + originator.getState());
        System.out.println("memento-0 " + careTaker.getMemento(0).getState());
        System.out.println("memento-1 " + careTaker.getMemento(1).getState());
    }
}
