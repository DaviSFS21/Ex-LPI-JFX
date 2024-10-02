package com.davi.classgui.entities;

public class Shoe {
    String brand, color, type;

    public Shoe(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public void wear() { System.out.println("You wore the shoe."); }
    public void store() { System.out.println("You've stored the shoe."); }
    public void clean() { System.out.println("You' cleaned the shoe!"); }
}
