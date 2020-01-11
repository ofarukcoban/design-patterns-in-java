package com.company.creational.prototype;

/**
 * Created by omerfarukcoban on 1.12.2019.
 */
public class Movie implements Media {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie";
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }
}
