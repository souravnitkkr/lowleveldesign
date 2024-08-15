package org.shrayansh.atm.state;

import org.shrayansh.atm.ATM;
import org.shrayansh.atm.Card;

public class HasCardState extends ATMState{

    public HasCardState() {
        System.out.println("ATM is set to HasCardState");
    }

    @Override
    public void enterPIN(ATM atm, Card card, int pin) throws Exception {
        if(card.validatePin(pin)){
            System.out.println("PIN successfully validated");
            atm.setAtmState(new SelectOperationState());
        }else{
            System.out.println("Wrong PIN entered");
            atm.setAtmState(new IdleState());
        }
    }

    @Override
    public void exit(ATM atm, Card card) {
        System.out.println("Exiting the transaction");
        atm.setAtmState(new IdleState());
    }

    @Override
    public String toString() {
        return "HasCardState";
    }
}
