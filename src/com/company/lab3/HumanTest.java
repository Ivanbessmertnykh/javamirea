package com.company.lab3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("Петя", 20, 70, 180);
        human.getLeftHand().deleteOneFinger();
        human.getHead().switchOffMyMind();
        human.getHead().shakeMyHead();
        System.out.println(human);
    }
}
