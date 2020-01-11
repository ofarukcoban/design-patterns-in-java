package com.company.behavioral.observer;

/**
 * Created by omerfarukcoban on 29.12.2019.
 */
public class Demo {
    public static void main(String[] args) {

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");

        System.out.println(observer.getNews());
    }
}
