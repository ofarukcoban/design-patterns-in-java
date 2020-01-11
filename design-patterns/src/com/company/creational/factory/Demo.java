package com.company.creational.factory;

import com.company.creational.factory.logistic.Logistic;
import com.company.creational.factory.logistic.RoadLogistic;
import com.company.creational.factory.logistic.SeaLogistic;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class Demo {

    public static Logistic logistic;

    public static void main(String[] args) {
        configure("ROAD");
        planDeliver();
    }

    private static void configure(String transportType){

        if(transportType.equals("ROAD")){
            logistic = new RoadLogistic();
        } else if(transportType.equals("SEA")){
            logistic =  new SeaLogistic();
        }
    }

    private static void planDeliver(){
        logistic.planDelivery();
    }
}
