package com.company.behavioral.visitor;

/**
 * Created by omerfarukcoban on 11.01.2020.
 */
public interface ShoppingCartVisitor {

    double visit(Book book);
    double visit(DVD dvd);
}
