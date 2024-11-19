package com.factoriaf5.solid.liskov.exercise1;

public class Ostrich extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}
