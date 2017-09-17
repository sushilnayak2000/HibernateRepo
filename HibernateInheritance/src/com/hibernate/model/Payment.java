package com.hibernate.model;

/**
 * Created by sushinayak2000 on 9/17/2017.
 */
public class Payment {

    private int paymentId;
    private double amount;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
