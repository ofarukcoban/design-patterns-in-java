package com.company.structural.adapter;

/**
 * Created by omerfarukcoban on 5.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        AmericanCar americanCar = new AmericanCar();
        AmericanToEuropeanAdapter americanCarAdapter = new AmericanToEuropeanAdapter(americanCar);
        System.out.println("american car speed limit is " + americanCarAdapter.getSpeed(americanCar.getSpeedLimit()) + " km");
        System.out.println("american car speed limit is " + americanCar.getSpeedLimit() + " mph");

        System.out.println();

        EuropeanCar europeanCar = new EuropeanCar();
        EuropeanToAmericanAdapter europeanCarAdapter = new EuropeanToAmericanAdapter(europeanCar);
        System.out.println("european car speed limit is " + europeanCar.getSpeedLimit() + " km");
        System.out.println("european car speed limit is " + europeanCarAdapter.getSpeed(europeanCar.getSpeedLimit()) + " mph");
    }
}
