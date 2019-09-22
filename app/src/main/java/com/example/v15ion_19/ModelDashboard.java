package com.example.v15ion_19;


import android.widget.LinearLayout;

public class ModelDashboard {

    private int balance = 0;
    private String cardNumber = "abc";
    private String cardType = "abc";

    public ModelDashboard(int balance, String cardNumber, String cardType) {
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
