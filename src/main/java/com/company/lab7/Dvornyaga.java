package com.company.lab7;

public class Dvornyaga extends Dog{

    public Dvornyaga(String name, int years) {
        super(name, years);
    }

    @Override
    protected void bark() {
        System.out.println("Гав гав");
    }

    @Override
    public String toString() {
        return "Dvornyaga{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
