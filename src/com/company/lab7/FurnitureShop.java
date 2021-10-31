package com.company.lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    private static ArrayList<Furniture> furnitureArrayList = new ArrayList<>();
    private static int sum = 0;

    public static void main(String[] args) {

        furnitureArrayList.add(new Stul(100, "Стул", "Стандартный"));
        furnitureArrayList.add(new Stol(230, "Стол", 3));
        furnitureArrayList.add(new Krovat(900, "Кровать", 2));
        furnitureArrayList.add(new Stul(150, "Стул", "Барный"));
        furnitureArrayList.add(new Stul(190, "Стул", "Музыкальный"));

        shop();
    }

    public static void shop(){
        System.out.println();
        System.out.println();
        System.out.println();

        while(true){
            System.out.println("Сумма в корзине:" + sum);
            System.out.println("Товары");
            for(int i=0; i<furnitureArrayList.size(); i++){
                System.out.println("ID: " + i + " " + furnitureArrayList.get(i));
            }
            System.out.println("Выберете товар");

            Scanner scanner = new Scanner(System.in);
            int idProduct = scanner.nextInt();

            sum += furnitureArrayList.get(idProduct).price;
        }
    }
}
