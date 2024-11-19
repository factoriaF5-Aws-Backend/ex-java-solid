package com.factoriaf5.solid.liskov.answer1;

public class NonFlyingBird extends Bird {
    @Override
    public void move() {
        walk();
    }

    public void walk() {
        System.out.println("Walking...");
    }
}
