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

    public String ride() { return "You're riding the bike!"; }
    public String stop() { return "You're stopping!"; }
    public String changeTires() { return "You're changing tires!"; }

    @Override
    public String toString() {
        return this.model + " " + this.type + " " + this.year;
    }
}
