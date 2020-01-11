package com.company.structural.flyweight.pen;

/**
 * Created by omerfarukcoban on 8.12.2019.
 */
public class ThinPen implements Pen {

    private String color;
    private static final String type = " THIN PEN";

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void write(String text) {
        System.out.println(text + " by " + color + type);
    }
}
