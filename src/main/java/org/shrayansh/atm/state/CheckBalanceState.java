package org.shrayansh.atm.state;

import org.shrayansh.atm.ATM;
import org.shrayansh.atm.BankAccount;
import org.shrayansh.atm.Card;

public class CheckBalanceState extends ATMState{

    public CheckBalanceState() {
        System.out.println("ATM is set to CheckBalanceState");
    }

    @Override
    public void checkBalance(ATM atm, Card card) throws Exception {
        BankAccount bankAccount=card.getBankAccount();
        System.out.println("Current balance is ="+bankAccount.getBalance());
    }

    @Override
    public void exit(ATM atm, Card card) throws Exception {
        System.out.println("Exiting the transaction");
        atm.setAtmState(new IdleState());
        returnCard();
    }

    @Override
    public void returnCard()throws Exception{
        System.out.println("Please collect your card");
    }
    @Override
    public String toString() {
        return "CheckBalanceState";
    }
}
