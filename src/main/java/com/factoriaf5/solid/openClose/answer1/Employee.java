package com.factoriaf5.solid.openClose.answer1;

public class Employee {
    private BonusCalculator bonusCalculator;

    public Employee(BonusCalculator bonusCalculator) {
        this.bonusCalculator = bonusCalculator;
    }

    public double getBonus() {
        return bonusCalculator.calculateBonus();
    }
}
