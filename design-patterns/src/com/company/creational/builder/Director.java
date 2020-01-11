package com.company.creational.builder;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class Director {

    public void makeSUV(Builder builder){
        builder.buildColor("blue");
        builder.buildEngine("diesel");
        builder.buildSeat("seven");
        builder.buildType("SUV");
    }

    public void makeSport(Builder builder){
        builder.buildColor("red");
        builder.buildEngine("petrol");
        builder.buildSeat("two");
        builder.buildType("SPORT");
    }
}
