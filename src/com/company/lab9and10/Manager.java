package com.company.lab9and10;

public class Manager extends Employee{

    public Manager(String name, String family, double salary, Company company) {
        super(name, family, salary, company);
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary() {
        this.salary = salary + (company.getIncome() * 0.05);
        return this.salary;
    }

    @Override
    public String toString() {
        return "Manager salary "  + Math.round(salary) + " руб.";
    }
}
