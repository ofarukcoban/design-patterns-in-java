package com.company.creational.abstract_factory;

import com.company.creational.abstract_factory.button.Button;
import com.company.creational.abstract_factory.checkbox.Checkbox;
import com.company.creational.abstract_factory.factory.GUIFactory;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class Application {

    public Button button;
    public Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
