package com.company.behavioral.template;

/**
 * Created by omerfarukcoban on 30.12.2019.
 */
public class WoodenHouse extends HouseTemplate {

    @Override
    protected void buildDoor() {
        System.out.printf("building wooden door");
        System.out.println();
    }

    @Override
    protected void buildWalls() {
        System.out.printf("building wooden walls");
        System.out.println();
    }
}
