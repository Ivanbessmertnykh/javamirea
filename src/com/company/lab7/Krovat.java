package com.company.lab7;

public class Krovat extends Furniture{
    protected int countOfPeople;

    public Krovat(int price, String name, int countOfPeople) {
        super(price, name);
        this.countOfPeople = countOfPeople;
    }

    @Override
    public String toString() {
        return "Krovat{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", countOfPeople=" + countOfPeople +
                '}';
    }
}
