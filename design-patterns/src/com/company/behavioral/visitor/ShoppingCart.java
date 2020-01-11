package com.company.behavioral.visitor;

/**
 * Created by omerfarukcoban on 11.01.2020.
 */
public class ShoppingCart implements ShoppingCartVisitor {
    private static final double discountForBookOver30 = 0.25d;
    private static final double discountForBookOver20 = 0.15d;
    private static final double discountForBookOver10 = 0.10d;
    private static final double discountForDvd = 0.20d;

    @Override
    public double visit(Book book) {

        double discount;
        if(book.getPrice()>30){
            discount = discountForBookOver30;
        }else if (book.getPrice()>20){
            discount = discountForBookOver20;
        }else if (book.getPrice()>10){
            discount = discountForBookOver10;
        }else{
            discount = 0d;
        }
        return getDiscountedPrice(book.getPrice(), discount);
    }

    @Override
    public double visit(DVD dvd) {
        return getDiscountedPrice(dvd.getPrice(), discountForDvd);
    }

    private double getDiscountedPrice(double price, double discount){
        return price * (1-discount);
    }
}
