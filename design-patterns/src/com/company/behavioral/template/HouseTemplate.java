package com.company.behavioral.template;

/**
 * Created by omerfarukcoban on 30.12.2019.
 */
public abstract class HouseTemplate {

    public final void buildHouse(){
        buildDoor();
        buildWalls();
        buildWindows();
        System.out.println("house is built");
    }

    private void buildWindows(){
        System.out.println("building glass windows");
    }

    protected abstract void buildDoor();

    protected abstract void buildWalls();
}
