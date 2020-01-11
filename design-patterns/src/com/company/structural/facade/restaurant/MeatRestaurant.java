package com.company.structural.facade.restaurant;


import com.company.structural.facade.menu.MeatMenu;
import com.company.structural.facade.menu.Menu;

/**
 * Created by omerfarukcoban on 8.12.2019.
 */
public class MeatRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new MeatMenu();
    }
}
