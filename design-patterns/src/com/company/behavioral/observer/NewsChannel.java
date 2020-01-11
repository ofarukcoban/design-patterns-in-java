package com.company.behavioral.observer;

/**
 * Created by omerfarukcoban on 29.12.2019.
 */
public class NewsChannel implements Channel {

    private String news;

    @Override
    public void update(Object object) {
        news = (String) object;
    }

    public String getNews() {
        return news;
    }
}
