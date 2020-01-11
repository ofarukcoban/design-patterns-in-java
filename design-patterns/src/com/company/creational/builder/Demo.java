package com.company.creational.builder;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class Demo {

    public static void main(String[] args) {

        CarBuilder builder = new CarBuilder();
        Director director = new Director();
        director.makeSport(builder);

        Car car = builder.getCar();

        System.out.println(car.toString());
    }

}
