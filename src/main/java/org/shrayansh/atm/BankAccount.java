package org.shrayansh.atm;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdrawAmount(ATM atm, int amountToWithdraw){
        balance-=amountToWithdraw;
        System.out.println("Amount successfully withdrew = "+amountToWithdraw);
        System.out.println("Net balance = "+balance);
    }

}
