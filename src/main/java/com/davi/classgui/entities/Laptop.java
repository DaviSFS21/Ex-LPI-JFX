package com.davi.classgui.entities;

public class Laptop {
    String brand, model, cpuName;

    public Laptop(String brand, String model, String cpuName) {
        this.brand = brand;
        this.model = model;
        this.cpuName = cpuName;
    }

    public void open() { System.out.println("entities.Laptop opened!"); }
    public void update() { System.out.println("The laptop has been updated!"); }
    public void upgradeRAM() { System.out.println("The laptop's RAM has been upgraded!"); }
}
