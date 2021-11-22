package com.company.lab7;

public abstract class Dish {
    protected int price;
    protected String color;
    protected boolean isDestroy = false;

    public Dish(int price, String color, boolean isDestroy) {
        this.price = price;
        this.color = color;
        this.isDestroy = isDestroy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDestroy() {
        return isDestroy;
    }

    public void setDestroy(boolean destroy) {
        isDestroy = destroy;
    }
}
