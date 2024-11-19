package com.factoriaf5.solid.interfaceSegregation.exercise2;

public class Printer implements Device{
    @Override
    public void print() {
        // Printing
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Printer cannot scan");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Printer cannot fax");
    }
}
