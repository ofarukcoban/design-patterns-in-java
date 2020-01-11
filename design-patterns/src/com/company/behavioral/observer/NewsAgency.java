package com.company.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omerfarukcoban on 29.12.2019.
 */
public class NewsAgency {

    private String news;

    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        channels.remove(channel);
    }

    public void setNews(String news) {

        this.news = news;
        for(Channel channel : channels){
            channel.update(news);
        }
    }

}
