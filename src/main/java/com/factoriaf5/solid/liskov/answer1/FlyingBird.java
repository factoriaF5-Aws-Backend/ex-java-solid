package com.factoriaf5.solid.liskov.answer1;

public class FlyingBird extends Bird {
    @Override
    public void move() {
        fly();
    }

    public void fly() {
        System.out.println("Flying...");
    }
}
