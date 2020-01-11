package com.company.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omerfarukcoban on 11.01.2020.
 */
public class Demo {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Book("book-1", 23.0d));
        items.add(new Book("book-2", 36.0d));
        items.add(new Book("book-3", 25.0d));
        items.add(new Book("book-4", 13.0d));
        items.add(new DVD("dvd-1", 42.0d));
        items.add(new DVD("dvd-2", 33.0d));

        double totalPrice = calculatePrice(items);
        System.out.println("Total price: " + totalPrice);

    }

    private static double calculatePrice(List<Item> items) {

        ShoppingCartVisitor visitor = new ShoppingCart();
        return items.stream().mapToDouble(item -> item.accept(visitor)).sum();
    }

}
