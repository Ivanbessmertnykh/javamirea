package com.company.lab29and30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> result = new HashMap<>();

        Arrays.stream(new Scanner(System.in, "UTF-8").nextLine().split("[\\p{Punct}\\s]+"))
                .map(String::toLowerCase)
                .forEach(w -> {
                    if (result.containsKey(w)) result.put(w, result.get(w) + 1);
                    else result.put(w, 1);
                });

        result.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if (e1.getValue().equals(e2.getValue())) return e1.getKey().compareTo(e2.getKey());
                    else return e2.getValue().compareTo(e1.getValue());
                })
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }
}

