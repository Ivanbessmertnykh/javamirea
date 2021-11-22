package com.company.lab3;

public class Leg {

    private Boolean isHromaet = false; // хромает ли нога


    public void hitTheWall(){
        isHromaet = true;
        System.out.println("Вы удалили ногой по стене");
    }

    public void hitTheBall(){
        System.out.println("Вы пнули мяч");
    }

    public void fixMyLeg(){
        isHromaet = false;
        System.out.println("Вы вылечили ногу");
    }

    @Override
    public String toString() {
        return "Leg{" +
                "isHromaet=" + isHromaet +
                '}';
    }
}
