package com.company.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by omerfarukcoban on 27.12.2019.
 */
public class NameIterator implements Iterator {

    private List<String> names = new ArrayList<>(Arrays.asList("Ali", "ata", "bak"));

    int index = 0;

    @Override
    public boolean hasNext() {

        if(names.isEmpty())
            return false;

        if(index < names.size())
            return true;
        return false;
    }

    @Override
    public String next() {

        if(names.isEmpty())
            return null;

        if(this.hasNext())
            return names.get(index++);

        return null;
    }
}
