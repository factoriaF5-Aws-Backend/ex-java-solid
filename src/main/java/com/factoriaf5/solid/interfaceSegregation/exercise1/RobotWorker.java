package com.factoriaf5.solid.interfaceSegregation.exercise1;

public class RobotWorker implements Worker{
    @Override
    public void work() {
        // Working
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}
