package com.company.structural.adapter;

/**
 * Created by omerfarukcoban on 5.12.2019.
 */
public class EuropeanToAmericanAdapter implements SpeedAdapter {

    private EuropeanCar europeanCar;

    public EuropeanToAmericanAdapter(EuropeanCar europeanCar) {
        this.europeanCar = europeanCar;
    }

    @Override
    public double getSpeed(double speed) {
        return europeanCar.getSpeedLimit() / 1.6;
    }
}
