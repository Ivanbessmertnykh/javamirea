package com.company.lab19and20;

//X, Y, Z — различные буквы автомобильного номера ("А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"), N — цифры, R — регион (от 01 до 199);
//        XNNNYZR — пример, A111BC197, Y777HC66

import java.io.Console;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] words = new char[]{'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
        int[] nums = new int[]{0,1,2,3,4,5,6,7,8,9};
        String[] regions = generateRegions();

        List<String> numberList = new ArrayList<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        for(int i =0; i<1000000; i++){
            String number = numberGenerator(words[(int) Math.floor(Math.random() * words.length)],
                    words[(int) Math.floor(Math.random() * words.length)],
                    words[(int) Math.floor(Math.random() * words.length)],
                    nums[(int) Math.floor(Math.random() * nums.length)],
                    regions[(int) Math.floor(Math.random() * regions.length)]
            );
            if(i == 999999) {
                System.out.println(number);
            }
            numberList.add(number);
            hashSet.add(number);
            treeSet.add(number);
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("hehe");
        String selfNum = scanner.nextLine();

        long contains = System.currentTimeMillis();
        boolean contains1 = numberList.contains(selfNum);
        System.out.println(
                "Поиск перебором: номер найден:" + contains1  + ", поиск занял " + (double) (System.currentTimeMillis() - contains) + "нс");

        long binaryTime = System.currentTimeMillis();
        Collections.sort(numberList);
        int i = Collections.binarySearch(numberList, selfNum);
        String solveBinary = "";
        if(i == 1){
            solveBinary = "Нашел";
        }else {
            solveBinary = "Не нашел";
        }
        System.out.println(
                "Бинарный поиск: номер найден:" + solveBinary  + ", поиск занял " + (double) (System.currentTimeMillis() - binaryTime) + "нс");

        long containsHashsettime = System.currentTimeMillis();
        boolean containsHashsettimer = hashSet.contains(selfNum);
        System.out.println(
                "Поиск перебором: номер найден:" + containsHashsettimer  + ", поиск занял " + (double) (System.currentTimeMillis() - containsHashsettime) + "нс");

        long containsTreesettime= System.currentTimeMillis();
        boolean containsTreesettimer = treeSet.contains(selfNum);
        System.out.println(
                "Поиск перебором: номер найден:" + containsTreesettimer  + ", поиск занял " + (double) (System.currentTimeMillis() - containsTreesettime) + "нс");
    }

    private static String numberGenerator(char x, char y, char z, int n, String r){
        String number = "";
        number = x + String.valueOf(n) + String.valueOf(n) + String.valueOf(n) + y + z + r;
        return number;
    }

    private static String[] generateRegions(){
        List<String> stringList = new ArrayList<>();
        int buff = 1;
        while(buff != 200){
            if(buff <=9){
                stringList.add("0" + buff);
            }else {
                stringList.add(String.valueOf(buff));
            }
            buff++;
        }
        String []arr = new String[stringList.size()];
        stringList.toArray(arr);
        return arr;
    }
}
