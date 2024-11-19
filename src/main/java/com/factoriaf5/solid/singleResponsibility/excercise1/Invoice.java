package com.factoriaf5.solid.singleResponsibility.excercise1;

public class Invoice {
    private int id;
    private double amount;

    public Invoice(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public void saveToDatabase() {
        // Code to save invoice to database
    }

    public void printInvoice() {
        // Code to print the invoice
    }

    public void sendEmail() {
        // Code to send invoice via email
    }
}

