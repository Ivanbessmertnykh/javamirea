package com.company.lab7;

public abstract class Dog {
    protected String name;
    protected int years;

    public Dog(String name, int years) {
        this.name = name;
        this.years = years;
    }

    protected void bark(){
        System.out.println("Гав");
    }
}
