package com.company.structural.composite;


/**
 * Created by omerfarukcoban on 7.12.2019.
 */
public class Developer implements Employee {

    private int id;
    private String name;
    private double salary;

    public Developer(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.printf(toString());
    }

    @Override
    public void add(Employee employee) {
       // TODO: nothing
    }

    @Override
    public void remove(Employee employee) {
        // TODO: nothing
    }

    @Override
    public Employee getChild(int i) {
        // TODO: nothing
        return null;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
