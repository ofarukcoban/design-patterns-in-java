package com.company.structural.composite;

/**
 * Created by omerfarukcoban on 7.12.2019.
 */
public interface Employee {

    int getId();
    String getName();
    double getSalary();
    void print();
    void add(Employee employee);
    void remove(Employee employee);
    Employee getChild(int i);

}
