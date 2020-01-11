package com.company.structural.facade;

import com.company.structural.facade.menu.MeatMenu;
import com.company.structural.facade.menu.VegMenu;

/**
 * Created by omerfarukcoban on 8.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        HotelKeeper hotelKeeper = new HotelKeeper();
        VegMenu vegMenu = hotelKeeper.getVegMenu();
        MeatMenu meatMenu = hotelKeeper.getMeatMenu();

        System.out.println("Hotel Restaurant");
        System.out.println(vegMenu.getDescription());
        System.out.println(meatMenu.getDescription());

    }
}
