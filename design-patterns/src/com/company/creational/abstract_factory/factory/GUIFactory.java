package com.company.creational.abstract_factory.factory;

import com.company.creational.abstract_factory.checkbox.Checkbox;
import com.company.creational.abstract_factory.button.Button;

/**
 * Created by omerfarukcoban on 30.11.2019.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
