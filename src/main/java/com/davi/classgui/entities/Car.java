package com.davi.classgui.entities;

public class Car {
    String brand, model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String accelerate() { return "You're accelerating the car!"; }
    public String brake() { return "You're braking the car!"; }
    public String openDoors() { return "Doors are open!"; }

    @Override
    public String toString() {
        return this.brand + " " + this.model + " " + this.year;
    }
}
