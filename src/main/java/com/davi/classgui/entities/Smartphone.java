package com.davi.classgui.entities;

public class Smartphone {
    String brand, model;
    double size;

    public Smartphone(String brand, String model, double size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public String turnOn() { return "Turning on..."; }
    public String takePhoto() { return "Taking a photo!"; }
    public String charge() { return "Charger has been plugged."; }

    @Override
    public String toString() {
        return this.size + " " + this.brand + " " + this.model;
    }
}
