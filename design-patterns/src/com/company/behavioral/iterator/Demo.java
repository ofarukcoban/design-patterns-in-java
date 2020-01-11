package com.company.behavioral.iterator;

/**
 * Created by omerfarukcoban on 27.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        NameRepository repository = new NameRepository();

        for(Iterator iterator = repository.getIterator(); iterator.hasNext(); ){

            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
