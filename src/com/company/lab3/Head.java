package com.company.lab3;

public class Head {
    private boolean isMindSwitch = true; // думает ли голова

    public void switchOffMyMind(){
        System.out.println("Вы выключили мозги");
        isMindSwitch = false;
    }

    public void switchOnMyMind(){
        System.out.println("Вы включили мозги");
        isMindSwitch = false;
    }

    public void shakeMyHead(){
        System.out.println("Вы потрясли головой");
    }

    @Override
    public String toString() {
        return "Head{" +
                "isMindSwitch=" + isMindSwitch +
                '}';
    }
}
