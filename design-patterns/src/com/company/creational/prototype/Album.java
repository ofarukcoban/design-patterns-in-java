package com.company.creational.prototype;

/**
 * Created by omerfarukcoban on 1.12.2019.
 */
public class Album implements Media {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Album";
    }

    @Override
    public Album clone() throws CloneNotSupportedException {
        return (Album) super.clone();
    }
}
