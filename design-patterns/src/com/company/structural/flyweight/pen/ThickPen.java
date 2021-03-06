package com.company.structural.flyweight.pen;

/**
 * Created by omerfarukcoban on 8.12.2019.
 */
public class ThickPen implements Pen {

    private String color;
    private static final String type = " THICK PEN";

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void write(String text) {
        System.out.println(text + " by " + color + type);
    }
}
