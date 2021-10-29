package com.company.lab3;

public class Hand {
    private int numberOfFinger;

    public Hand(int numberOfFinger) {
        this.numberOfFinger = numberOfFinger;
    }

    public int getNumberOfFinger() {
        return numberOfFinger;
    }

    public void deleteOneFinger(){
        if(numberOfFinger > 0){
            numberOfFinger--;
            System.out.println("Поздравляем! Теперь у Вас " + numberOfFinger + " пальца");
        }else{
            System.out.println("К сожалению, все пальцы закончились");

        }    }

    public void setNumberOfFinger(int numberOfFinger) {
        this.numberOfFinger = numberOfFinger;
    }

    public void makeHandshake(){
        System.out.println("Пожал руку");
    }

    public void moveUp(){
        System.out.println("Поднял руку");
    }

    public void moveDown(){
        System.out.println("Опустил руку");
    }

    public void moveRight(){
        System.out.println("Повернул руку направо");
    }

    public void moveLeft(){
        System.out.println("Повернул руку налево");
    }

    @Override
    public String toString() {
        return "Hand{" +
                "numberOfFinger=" + numberOfFinger +
                '}';
    }
}
