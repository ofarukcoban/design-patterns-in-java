package com.company.creational.abstract_factory.factory;

import com.company.creational.abstract_factory.button.Button;
import com.company.creational.abstract_factory.button.MacButton;
import com.company.creational.abstract_factory.checkbox.Checkbox;
import com.company.creational.abstract_factory.checkbox.MacCheckbox;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
