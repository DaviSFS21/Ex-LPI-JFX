package com.davi.classgui.entities;

public class Shoe {
    String brand, color, type;

    public Shoe(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public String wear() { return "You wore the shoe."; }
    public String store() { return "You've stored the shoe."; }
    public String clean() { return "You' cleaned the shoe!"; }

    @Override
    public String toString() {
        return this.color + " " + this.brand + " for " + this.type;
    }
}
