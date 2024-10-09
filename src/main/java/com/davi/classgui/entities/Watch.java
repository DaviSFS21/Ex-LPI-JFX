package com.davi.classgui.entities;

public class Watch {
    String brand, model, type;

    public Watch(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public String adjustTime() { return "You've adjusted the time!"; }
    public String startTimer() { return "Timer running..."; }
    public String stopTimer() { return "Timer stopped!"; }

    @Override
    public String toString() {
        return this.type + " " + this.brand + " " + this.model;
    }
}
