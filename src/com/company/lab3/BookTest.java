package com.company.lab3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "Михаил Булгаков", 1928, 200);
        book.nextPage();
        book.nextPage();
        book.nextPage();
        book.nextPage();
        System.out.println(book);
    }
}
