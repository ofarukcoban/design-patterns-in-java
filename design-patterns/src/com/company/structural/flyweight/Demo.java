package com.company.structural.flyweight;

import com.company.structural.flyweight.pen.Pen;

/**
 * Created by omerfarukcoban on 8.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        Pen fistThinPen = PenFactory.getThinPen("Blue");
        Pen secondThinPen = PenFactory.getThinPen("Blue");
        Pen thickPen = PenFactory.getThickPen("Red");

        System.out.println(thickPen.hashCode());
        System.out.println(fistThinPen.hashCode());
        System.out.println(secondThinPen.hashCode());
    }
}
