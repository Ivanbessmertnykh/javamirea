package com.company.lab3;

public class Circle {

    private int radius;
    private int diameter;

    public Circle(int radius) {
        this.radius = radius;
        this.diameter = 2*radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        this.diameter = 2*radius;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Объект Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
