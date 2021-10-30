package com.company.lab4;

public class Square extends Rectangle{

    protected double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){

    }

    public void setLength(double side){}

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }
}
