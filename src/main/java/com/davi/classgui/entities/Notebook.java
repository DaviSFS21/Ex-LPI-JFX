package com.davi.classgui.entities;

public class Notebook {
    String brand, color;
    int numberOfPages;

    public Notebook(String brand, String color, int numberOfPages) {
        this.brand = brand;
        this.color = color;
        this.numberOfPages = numberOfPages;
    }

    public void open() { System.out.println("Opening the notebook..."); }
    public void close() { System.out.println("Closing the notebook..."); }
    public void removePage() {
        numberOfPages--;
        System.out.printf("A page has been removed!%n%nNow, the book has $d pages.");
    }
}