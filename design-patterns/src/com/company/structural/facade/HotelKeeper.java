package com.company.structural.facade;

import com.company.structural.facade.menu.MeatMenu;
import com.company.structural.facade.menu.VegMenu;
import com.company.structural.facade.restaurant.MeatRestaurant;
import com.company.structural.facade.restaurant.VegRestaurant;

/**
 * Created by omerfarukcoban on 8.12.2019.
 */
public class HotelKeeper {

    private static VegRestaurant vegRestaurant = new VegRestaurant();
    private static MeatRestaurant meatRestaurant = new MeatRestaurant();

    public VegMenu getVegMenu(){
        return (VegMenu) vegRestaurant.getMenu();
    }

    public MeatMenu getMeatMenu(){
        return (MeatMenu) meatRestaurant.getMenu();
    }
}
