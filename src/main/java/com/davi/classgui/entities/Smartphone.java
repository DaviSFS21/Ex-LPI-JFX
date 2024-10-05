package com.davi.classgui.entities;

public class Smartphone {
    String brand, model;
    double size;

    public Smartphone(String brand, String model, double size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public void turnOn() { System.out.println("Turning on..."); }
    public void takePhoto() { System.out.println("Taking a photo!"); }
    public void charge() { System.out.println("Charger has been plugged."); }

    @Override
    public String toString() {
        return this.size + " " + this.brand + " " + this.model;
    }
}
