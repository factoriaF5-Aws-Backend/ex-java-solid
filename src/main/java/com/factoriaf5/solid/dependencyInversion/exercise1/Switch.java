package com.factoriaf5.solid.dependencyInversion.exercise1;

public class Switch {
    private LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void operate() {
        lightBulb.turnOn();
    }

    //The Switch class depends directly on the LightBulb implementation, violating DIP.
}
