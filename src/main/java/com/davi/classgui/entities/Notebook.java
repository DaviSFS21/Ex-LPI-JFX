package com.davi.classgui.entities;

public class Notebook {
    String brand, color;
    int numberOfPages;

    public Notebook(String brand, String color, int numberOfPages) {
        this.brand = brand;
        this.color = color;
        this.numberOfPages = numberOfPages;
    }

    public String open() { return "Opening the notebook..."; }
    public String close() { return "Closing the notebook..."; }
    public String removePage() {
        numberOfPages--;
        return "A page has been removed! Now, the book has " + numberOfPages + " pages.";
    }

    @Override
    public String toString() {
        return this.color + " " + this.brand + " with " + this.numberOfPages + " pages";
    }
}