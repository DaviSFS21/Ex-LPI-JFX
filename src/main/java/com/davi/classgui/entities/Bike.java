package com.davi.classgui.entities;

public class Bike {
    String model, type;
    int year;

    public Bike(String model, String type, int year) {
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public void ride() { System.out.println("You're riding the bike!"); }
    public void stop() { System.out.println("You're stopping!"); }
    public void changeTires() { System.out.println("Tires are changed!"); }

    @Override
    public String toString() {
        return this.model + " " + this.type + " " + this.year;
    }
}
