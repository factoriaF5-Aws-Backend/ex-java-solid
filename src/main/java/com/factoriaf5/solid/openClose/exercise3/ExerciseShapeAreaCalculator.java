package com.factoriaf5.solid.openClose.exercise3;

public class ExerciseShapeAreaCalculator {
    public double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
