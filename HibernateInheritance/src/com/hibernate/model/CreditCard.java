package com.hibernate.model;

/**
 * Created by sushilnayak2000 on 9/17/2017.
 */
public class CreditCard extends Payment{

    private String creditCardType;

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }
}
