package com.company.structural.flyweight;

import com.company.structural.flyweight.pen.MediumPen;
import com.company.structural.flyweight.pen.Pen;
import com.company.structural.flyweight.pen.ThickPen;
import com.company.structural.flyweight.pen.ThinPen;

import java.util.HashMap;

/**
 * Created by omerfarukcoban on 8.12.2019.
 */
public class PenFactory {

    private static HashMap<String, Pen> penMap = new HashMap<>();

    public static Pen getThinPen(String color){

        String key = color + " Thin Pen";
        Pen pen = penMap.get(key);
        if(pen != null)
            return pen;

        pen = new ThinPen();
        pen.setColor(color);
        penMap.put(key, pen);
        return pen;
    }

    public static Pen getThickPen(String color){

        String key = color + " Thick Pen";
        Pen pen = penMap.get(key);
        if(pen != null)
            return pen;

        pen = new ThickPen();
        pen.setColor(color);
        penMap.put(key, pen);
        return pen;
    }

    public static Pen getMediumPen(String color){

        String key = color + " Medium Pen";
        Pen pen = penMap.get(key);
        if(pen != null) {
            return pen;
        }

        pen = new MediumPen();
        pen.setColor(color);
        penMap.put(key, pen);
        return pen;
    }

}
