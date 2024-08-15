package org.shrayansh.atm.state;

import org.shrayansh.atm.ATM;
import org.shrayansh.atm.Card;
import org.shrayansh.atm.TransactionType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card) throws Exception{
        throw new Exception("Oops something went wrong");
    }
    public void enterPIN(ATM atm,Card card,int pin) throws Exception{
        throw new Exception("Oops something went wrong");
    }
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) throws Exception{
        throw new Exception("Oops something went wrong");
    }
    public void withDrawCash(ATM atm, Card card, int amountToBeWithDrawn) throws Exception{
        throw new Exception("Oops something went wrong");
    }
    public void checkBalance(ATM atm,Card card) throws Exception{
        throw new Exception("Oops something went wrong");
    }
    public void exit(ATM atm, Card card) throws Exception{
        throw new Exception("Oops something went wrong");
    }
    public void returnCard()throws Exception{
        throw new Exception("OOPS!! Something went wrong");
    }
}
