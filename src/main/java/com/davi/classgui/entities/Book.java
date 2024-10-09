package com.davi.classgui.entities;

public class Book {
    String title, author;
    int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String open() { return "You opened the book!"; }
    public String nextPage() { return "You've reached the next page."; }
    public String previousPage() { return "You've reached the previous page."; }

    @Override
    public String toString() {
        return this.title + " - " + this.author + " / Pages: " + this.numberOfPages;
    }
}
