package com.company.lab9and10;

public abstract class Employee implements EmployeePosition{
    protected String name;
    protected String family;
    protected double salary;
    protected Company company;

    public Employee(String name, String family, double salary, Company company) {
        this.name = name;
        this.family = family;
        this.salary = salary;
        this.company = company;
    }

}
