package com.company.lab7;

public class DogTest{
    public static void main(String[] args) {
        Dog shpic = new Shpic("Шарик", 10);
        Dog dvornyaga = new Dvornyaga("Бобик", 12);
        Dog alabai = new Alabai("Тузик", 8);

        shpic.bark();
        dvornyaga.bark();
        alabai.bark();
    }
}
