package com.company.lab7;

public class Stul extends Furniture {

    protected String type;

    public Stul(int price, String name, String type) {
        super(price, name);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Stul{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
