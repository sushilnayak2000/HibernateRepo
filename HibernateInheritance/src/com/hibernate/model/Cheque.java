package com.hibernate.model;

/**
 * Created by sushilnayak2000 on 9/17/2017.
 */
public class Cheque extends Payment {
    private String chequeType;

    public String getChequeType() {
        return chequeType;
    }

    public void setChequeType(String chequeType) {
        this.chequeType = chequeType;
    }
}
