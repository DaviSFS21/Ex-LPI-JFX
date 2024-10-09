package com.davi.classgui.entities;

public class Joystick {
    String brand, color, consoleName;

    public Joystick(String brand, String color, String consoleName) {
        this.brand = brand;
        this.color = color;
        this.consoleName = consoleName;
    }

    public String turnOn() { return "The controller is now on!"; }
    public String changeBattery() { return "You've changed the battery!"; }
    public String pressStart() { return "Start button pressed!"; }

    @Override
    public String toString() {
        return this.color + " " + this.brand + " Joystick - " + this.consoleName;
    }
}
