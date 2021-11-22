package com.company.lab7;

public class Chainik extends Dish{

    private boolean switchOn = false;
    private boolean isFull = false;

    public Chainik(int price, String color, boolean isDestroy) {
        super(price, color, isDestroy);
    }

    public void switchChainik(){
        System.out.println("Чайник включен");
        switchOn = true;
    }

    public void switchOff(){
        System.out.println("Чайник выключен");
        switchOn = false;
    }

    public void nalitVoduVChainik(){
        System.out.println("Налил воду в чайник");
        isFull = true;
    }

    @Override
    public String toString() {
        return "Chainik{" +
                "switchOn=" + switchOn +
                ", isFull=" + isFull +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isDestroy=" + isDestroy +
                '}';
    }
}
