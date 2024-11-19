package com.factoriaf5.solid.liskov.exercise3;

public class Payment {
    public void processPayment(String paymentType) {
        if (paymentType.equals("CreditCard")) {
            // Process credit card payment
        } else if (paymentType.equals("Cash")) {
            // Process cash payment
        }
    }
}
