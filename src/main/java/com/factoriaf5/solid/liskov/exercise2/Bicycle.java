package com.factoriaf5.solid.liskov.exercise2;

public class Bicycle extends Vehicle{
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycles don't have engines");
    }

}
