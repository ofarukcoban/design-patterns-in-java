package com.company.structural.facade.restaurant;


import com.company.structural.facade.menu.Menu;
import com.company.structural.facade.menu.VegMenu;

/**
 * Created by omerfarukcoban on 8.12.2019.
 */
public class VegRestaurant implements Hotel {

    @Override
    public Menu getMenu() {
        return new VegMenu();
    }
}
