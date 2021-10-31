package com.company.lab7;

public class Shpic extends Dog{
    public Shpic(String name, int years) {
        super(name, years);
    }

    @Override
    protected void bark() {
        System.out.println("Тяф тяф");
    }

    @Override
    public String toString() {
        return "Shpic{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
