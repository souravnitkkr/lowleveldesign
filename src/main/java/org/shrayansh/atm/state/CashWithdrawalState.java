package org.shrayansh.atm.state;

import org.shrayansh.atm.ATM;
import org.shrayansh.atm.BankAccount;
import org.shrayansh.atm.Card;
import org.shrayansh.atm.chainofresponsibility.CashWithdrawalProcessor;
import org.shrayansh.atm.chainofresponsibility.FiveHundredWithdrawalProcessor;
import org.shrayansh.atm.chainofresponsibility.OneHundredWithdrawalProcessor;
import org.shrayansh.atm.chainofresponsibility.TwoThousandWithdrawalProcessor;

public class CashWithdrawalState extends ATMState{

    private CashWithdrawalProcessor withdrawalProcessor;

    public CashWithdrawalState() {
        System.out.println("ATM is set to CashWithdrawalState");
        withdrawalProcessor = new TwoThousandWithdrawalProcessor(
                new FiveHundredWithdrawalProcessor(
                        new OneHundredWithdrawalProcessor(null)));
    }


    @Override
    public void withDrawCash(ATM atm, Card card, int amountToBeWithDrawn) throws Exception {

        if(atm.getAtmBalance() < amountToBeWithDrawn){
            System.out.println("Insufficient balance in the ATM machine, Try in another one");
            exit(atm,card);
        }else if(card.getBankAccount().getBalance() < amountToBeWithDrawn){
            System.out.println("Insufficient balance in your account");
            exit(atm, card);
        }else {
            withdrawalProcessor.withDraw(atm, amountToBeWithDrawn);
            BankAccount bankAccount = card.getBankAccount();
            bankAccount.withdrawAmount(atm, amountToBeWithDrawn);
            exit(atm, card);
        }
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
        return "CashWithdrawalState";
    }
}
