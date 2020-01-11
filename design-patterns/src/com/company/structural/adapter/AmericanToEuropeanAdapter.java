package com.company.structural.adapter;

/**
 * Created by omerfarukcoban on 5.12.2019.
 */
public class AmericanToEuropeanAdapter implements SpeedAdapter {

    private AmericanCar americanCar;

    public AmericanToEuropeanAdapter(AmericanCar americanCar) {
        this.americanCar = americanCar;
    }

    @Override
    public double getSpeed(double speed) {
        return americanCar.getSpeedLimit() * 1.6;
    }
}
