package com.company.lab19and20.third;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Text\n2. Music\n3. Image");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1:
                textMenu();
                break;
            case 2:
                musicMenu();
                break;
            case 3:
                imageMenu();
                break;
            default:
                System.out.println("Bad select");
        }

    }

    public static void textMenu(){
        System.out.println("Text menu:\n1. New\n2. Open\n3. Save\n 4. Exit");
        IDocument textDocument = new TextDocument();
    }

    public static void musicMenu(){
        System.out.println("Music menu:\n1. New\n2. Open\n3. Save\n 4. Exit");

    }

    public static void imageMenu(){
        System.out.println("Image menu:\n1. New\n2. Open\n3. Save\n 4. Exit");

    }




}
