package com.davi.classgui.entities;

public class Book {
    String title, author;
    int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void open() { System.out.println("You opened the book!"); }
    public void nextPage() { System.out.println("You've reached the next page."); }
    public void previousPage() { System.out.println("You've reached the previous page."); }
}
