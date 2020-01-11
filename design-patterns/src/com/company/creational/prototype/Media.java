package com.company.creational.prototype;

/**
 * Created by omerfarukcoban on 1.12.2019.
 */
public interface Media extends Cloneable {

    Media clone() throws CloneNotSupportedException;
}
