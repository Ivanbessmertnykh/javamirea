package com.company.lab1;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        third();
        System.out.println();
        fourth(args);
        System.out.println();
        fifth();
        System.out.println();
        sixth();
        System.out.println();
        seventh();
    }

    public static void third() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма массива через For " + sum);

        sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Сумма массива через Foreach " + sum);

        sum = 0;
        int counter = 0;
        while (counter != array.length) {
            sum = sum + array[counter];
            counter++;
        }
        System.out.println("Сумма массива через While " + sum);


        sum = 0;
        counter = 0;
        do {
            sum = sum + array[counter];
            counter++;
        } while (counter != array.length);
        System.out.println("Сумма массива через Do while " + sum);

    }

    public static void fourth(String[] args) {
        for (String str : args) {
            System.out.print(str + " ");
        }
    }

    public static void fifth() {
        for (int i = 1; i < 11; i++) {
            System.out.printf("Элемент %d : %f \n", i, 1. / i);
        }
    }

    public static void sixth() {
        int[] first = new int[12];
        int[] second = new int[12];

        for (int i = 0; i < first.length; i++) {
            first[i] = (int) Math.round((Math.random() * 10));
        }

        Random random = new Random();
        for (int i = 0; i < second.length; i++) {
            second[i] = random.nextInt(10);
        }

        System.out.print("Массив 1: ");
        for (int num : first) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Массив 2: ");
        for (int num : second) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Массив 1 после сортировки: ");
        for (int num : bubbleSort(first)) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Массив 2 после сортировки: ");
        for (int num : bubbleSort(second)) {
            System.out.print(num + " ");
        }

        System.out.println();

    }

    public static void seventh() {
        int result = 1;
        int number = 3;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.printf("Факториал числа %d : %d", number, result);
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
