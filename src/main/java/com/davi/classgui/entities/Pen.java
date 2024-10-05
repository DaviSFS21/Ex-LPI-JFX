package com.davi.classgui.entities;

public class Pen {
    String brand, color, type;

    public Pen(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public void takeCap() { System.out.println("You took the cap off!"); }
    public void putCap() { System.out.println("The cap is back in the pen."); }
    public void write() { System.out.println("Writing..."); }

    @Override
    public String toString() {
        return this.type + " " + this.color + " " + this.brand;
    }
}