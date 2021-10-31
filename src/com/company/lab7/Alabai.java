package com.company.lab7;

public class Alabai extends Dog{

    public Alabai(String name, int years) {
        super(name, years);
    }

    @Override
    protected void bark() {
        System.out.println("Aaaaуууф ааааауф");
    }

    @Override
    public String toString() {
        return "Alabai{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
