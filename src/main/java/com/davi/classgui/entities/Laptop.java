package com.davi.classgui.entities;

public class Laptop {
    String brand, model, cpuName;

    public Laptop(String brand, String model, String cpuName) {
        this.brand = brand;
        this.model = model;
        this.cpuName = cpuName;
    }

    public String open() { return "entities.Laptop opened!"; }
    public String update() { return "The laptop has been updated!"; }
    public String upgradeRAM() { return "The laptop's RAM has been upgraded!"; }

    @Override
    public String toString() {
        return this.brand + " " + this.model + " - " + this.cpuName;
    }
}
