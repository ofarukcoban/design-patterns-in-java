package com.company.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omerfarukcoban on 29.12.2019.
 */
public class CareTaker {

    List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento){
        mementos.add(memento);
    }

    public Memento getMemento(int index){
        return mementos.get(index);
    }
}
