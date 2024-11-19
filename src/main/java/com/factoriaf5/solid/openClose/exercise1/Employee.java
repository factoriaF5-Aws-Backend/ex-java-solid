package com.factoriaf5.solid.openClose.exercise1;

public class Employee {
        public double calculateBonus(String type) {
            if (type.equals("Manager")) {
                return 1000.0;
            } else if (type.equals("Developer")) {
                return 800.0;
            }
            return 500.0;
        }

}
