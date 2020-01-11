package com.company.creational.abstract_factory.factory;

import com.company.creational.abstract_factory.button.Button;
import com.company.creational.abstract_factory.button.WinButton;
import com.company.creational.abstract_factory.checkbox.Checkbox;
import com.company.creational.abstract_factory.checkbox.WinCheckbox;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
