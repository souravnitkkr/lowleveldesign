package org.shrayansh.atm;

import java.util.Date;

public class Card {
    private String cardNumber;
    private int cvv;
    private Date expiryDate;
    private BankAccount bankAccount;
    private final int PIN=1234;


    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public boolean validatePin(int pin){
        return (PIN == pin);
    }
}
