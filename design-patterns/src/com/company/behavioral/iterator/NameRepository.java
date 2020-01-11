package com.company.behavioral.iterator;

/**
 * Created by omerfarukcoban on 27.12.2019.
 */
public class NameRepository implements Container {

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
