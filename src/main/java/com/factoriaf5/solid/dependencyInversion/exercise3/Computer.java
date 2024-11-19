package com.factoriaf5.solid.dependencyInversion.exercise3;

public class Computer {
    private Keyboard keyboard;

    public Computer() {
        this.keyboard = new Keyboard();
    }

    public void useKeyboard() {
        keyboard.type();
    }
}
