package com.davi.classgui.entities;

public class Pen {
    String brand, color, type;

    public Pen(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public String takeCap() { return "You took the cap off!"; }
    public String putCap() { return "The cap is back in the pen."; }
    public String write() { return "Writing..."; }

    @Override
    public String toString() {
        return this.type + " " + this.color + " " + this.brand;
    }
}