package com.company.creational.builder;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public interface Builder {

    void buildEngine(String engine);

    void buildSeat(String seat);

    void buildColor(String color);

    void buildType(String type);

}
