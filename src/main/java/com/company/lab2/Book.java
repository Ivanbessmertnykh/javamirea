package com.company.lab2;

public class Book {
    private String author;
    private int publicYear;
    private int countPage;
    private String title;
    private String description;

    public Book(String author, int publicYear, int countPage, String title, String description) {
        this.author = author;
        this.publicYear = publicYear;
        this.countPage = countPage;
        this.title = title;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publicYear=" + publicYear +
                ", countPage=" + countPage +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
