package com.company.lab7;

public class Stol extends Furniture{

    protected int countOfLegs;

    public Stol(int price, String name, int countOfLegs) {
        super(price, name);
        this.countOfLegs = countOfLegs;
    }

    @Override
    public String toString() {
        return "Stol{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", countOfLegs=" + countOfLegs +
                '}';
    }
}
