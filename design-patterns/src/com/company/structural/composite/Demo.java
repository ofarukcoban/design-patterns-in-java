package com.company.structural.composite;

/**
 * Created by omerfarukcoban on 7.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        GeneralManager generalManager = new GeneralManager(1, "Ömer", 12345d);
        Manager manager = new Manager(2, "Faruk", 10000d);
        Developer developer = new Developer(3, "Çoban", 8888d);
        manager.add(developer);
        generalManager.add(manager);
        generalManager.print();
    }


}
