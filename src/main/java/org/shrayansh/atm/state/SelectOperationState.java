package org.shrayansh.atm.state;

import org.shrayansh.atm.ATM;
import org.shrayansh.atm.Card;
import org.shrayansh.atm.TransactionType;

public class SelectOperationState extends ATMState{

    public SelectOperationState() {
        System.out.println("ATM is set to SelectOperationState");
        showAllTransactionType();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType transactionType) throws Exception {
        switch (transactionType){
            case BALANCE_CHECK:  atm.setAtmState(new CheckBalanceState());
                                 break;
            case CASH_WITHDRAWAL:atm.setAtmState(new CashWithdrawalState());
                                 break;
            default:             System.out.println("Enter the valid option");
                                 exit(atm,card);
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

    private void showAllTransactionType(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionType();
    }

    @Override
    public String toString() {
        return "SelectOperationState";
    }
}
