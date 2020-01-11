package com.company.behavioral.visitor;

/**
 * Created by omerfarukcoban on 11.01.2020.
 */
public interface Item {

    double accept(ShoppingCartVisitor visitor);
}
