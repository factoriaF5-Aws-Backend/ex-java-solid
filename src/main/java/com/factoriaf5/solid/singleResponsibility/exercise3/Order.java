package com.factoriaf5.solid.singleResponsibility.exercise3;

public class Order {
    private int orderId;
    private String product;

    public Order(int orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    public void calculateTotal() {
        // Code to calculate total order amount
    }

    public void sendInvoice() {
        // Code to send invoice
    }

    public void changeOrderStatus(String status) {
        // Code to change order status
    }
}
