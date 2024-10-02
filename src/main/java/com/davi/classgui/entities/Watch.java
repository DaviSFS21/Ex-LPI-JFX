package com.davi.classgui.entities;

public class Watch {
    String brand, model, type;

    public Watch(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public void adjustTime() { System.out.println("You've adjusted the time!"); }
    public void startTimer() { System.out.println("Timer running..."); }
    public void stopTimer() { System.out.println("Timer stopped!"); }
}
