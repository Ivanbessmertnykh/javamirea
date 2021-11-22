package com.company.lab2;

public class Main {
    public static void main(String[] args) {
        first();
        System.out.println();
        second();
        System.out.println();
        third();
        System.out.println();
        fourth();
    }

    public static void first(){
        Shape shape = new Shape("Квадрат", "Белый");
        System.out.println(shape);
    }

    public static void second(){
        Ball ball = new Ball("Белый", "Футбольный");
        System.out.println(ball);
        ball.hitBall("strong");
        System.out.println(ball);
    }

    public static void third(){
        Book book = new Book("Нистрем Р.",
                2021,
                432,
                "Паттерны программирования игр",
                "Самый большой вызов для программиста видеоигр – закончить игру. " +
                        "Громоздкий и запутанный код часто становится неразрешимой проблемой, " +
                        "которая тянет проект на дно и деморализует всю команду. Об этом, как никто другой," +
                        " знает Роберт Нистрем, восемь лет проработавший в Electronic Arts. " +
                        "Книга Роберта основана на его богатом профессиональном опыте и содержит проверенные советы " +
                        "и хаки по улучшению вашего кода и оптимизации игры. " +
                        "Каждая глава книги – независимая идея, которую вы можете воплощать в собственном коде, " +
                        "а комбинируя эти паттерны и придумывая на их основе нечто свое, вы, вне всякого сомнения, " +
                        "улучшите свои навыки и станете ближе к совершенному коду.");
        System.out.println(book);
    }

    public static void fourth(){
        DogNursery dogNursery = new DogNursery();
        Dog dog = new Dog("Бобик", 10);
        Dog dog1 = new Dog("Тузик", 1);
        Dog dog2 = new Dog("Пыжик", 7);
        Dog dog3 = new Dog("Чижик", 3);

        dogNursery.addNewDog(dog);
        dogNursery.addNewDog(dog1);
        dogNursery.addNewDog(dog2);
        dogNursery.addNewDog(dog3);

        dogNursery.getAllDogs();

        System.out.println();
        System.out.println(dog1);
        dog1.convertDogAgeToHumanAge();
        System.out.println(dog1);
    }

}
