package com.company.lab3;

//(автор, название, год написания

import java.util.Date;

public class Book {
    private String author;
    private String name;
    private int writeYear;
    private int countOfPages;
    private int totalPage = 1;
    private boolean isFinished = false;

    public Book(String author, String name, int writeYear, int countOfPages) {
        this.author = author;
        this.name = name;
        this.writeYear = writeYear;
        this.countOfPages = countOfPages;
    }

    public void nextPage(){
        if(totalPage + 1 > countOfPages){
            System.out.println("Книга прочитана");
            isFinished = true;
            return;
        }
        totalPage++;
        System.out.println("Вы перевернули страницу. Текущая страница " + totalPage);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", writeYear=" + writeYear +
                ", countOfPages=" + countOfPages +
                ", totalPage=" + totalPage +
                ", isFinished=" + isFinished +
                '}';
    }
}
