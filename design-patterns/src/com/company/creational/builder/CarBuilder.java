package com.company.creational.builder;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class CarBuilder implements Builder {

    private Car car = new Car();

    public Car getCar() {
        return car;
    }

    @Override
    public void buildEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void buildSeat(String seat) {
        car.setSeat(seat);
    }

    @Override
    public void buildColor(String color) {
        car.setColor(color);
    }

    @Override
    public void buildType(String type) {
        car.setType(type);
    }
}
