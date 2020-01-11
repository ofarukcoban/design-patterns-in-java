package com.company.creational.abstract_factory.checkbox;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("WinCheckbox paint");
    }
}
