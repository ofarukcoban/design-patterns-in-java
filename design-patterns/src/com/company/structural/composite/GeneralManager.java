package com.company.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omerfarukcoban on 7.12.2019.
 */
public class GeneralManager implements Employee {

    private int id;
    private String name;
    private double salary;
    private List<Employee> childEmployee;

    public GeneralManager(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.childEmployee = new ArrayList<>();
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
        childEmployee.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        childEmployee.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return childEmployee.get(i);
    }

    @Override
    public String toString() {
        return "GeneralManager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", childEmployee=" + childEmployee +
                '}';
    }
}
