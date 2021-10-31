package com.company.lab7;

public class Skovoroda extends Dish {

    private boolean isHot = false;

    public Skovoroda(int price, String color, boolean isDestroy) {
        super(price, color, isDestroy);
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public void makeSkovorodaHot(){
        System.out.println("Вы поставили сковороду на печку");
        setHot(true);
    }

    public void makeSkovorodaNotHot(){
        System.out.println("Вы убрали сковороду с печки");
        setHot(false);
    }

    public void hitSkovorodoi(){
        System.out.println("Вы ударили кого-то сковородой. Она сломалась");
        setDestroy(true);
    }

    public void fixSkovoroda(){
        System.out.println("Сковорода отремонтирована");
        setDestroy(false);
    }

    @Override
    public String toString() {
        return "Skovoroda{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", isDestroy=" + isDestroy +
                ", isHot=" + isHot +
                '}';
    }
}
