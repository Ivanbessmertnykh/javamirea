package com.company.lab9and10;

public class Operator extends Employee{
    public Operator(String name, String family, double salary, Company company) {
        super(name, family, salary, company);
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Operator salary "  + Math.round(salary) + " руб.";
    }
}
