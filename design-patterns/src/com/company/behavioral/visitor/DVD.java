package com.company.behavioral.visitor;

/**
 * Created by omerfarukcoban on 11.01.2020.
 */
public class DVD implements Item {

    private String name;
    private double price;

    public DVD(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
