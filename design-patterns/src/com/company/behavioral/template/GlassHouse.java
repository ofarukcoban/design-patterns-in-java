package com.company.behavioral.template;

/**
 * Created by omerfarukcoban on 30.12.2019.
 */
public class GlassHouse extends HouseTemplate {
    @Override
    protected void buildDoor() {
        System.out.println("building glass door");
    }

    @Override
    protected void buildWalls() {
        System.out.println("building glass walls");
    }
}
