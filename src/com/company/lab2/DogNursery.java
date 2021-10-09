package com.company.lab2;

import java.util.ArrayList;

public class DogNursery {
    private ArrayList<Dog> dogArrayList = new ArrayList<>();

    public void addNewDog(Dog dog){
        dogArrayList.add(dog);
        System.out.println("Собака добавлена!");
    }

    public void getAllDogs(){
        System.out.println("Собаки в питомнике: ");
        for(Dog dog: dogArrayList){
            System.out.println(dog);
        }
    }
}
