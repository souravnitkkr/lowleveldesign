package org.shrayansh.atm.state;

import org.shrayansh.atm.ATM;
import org.shrayansh.atm.Card;

public class IdleState extends ATMState{

    public IdleState(){
        System.out.println("Setting the ATM machine in Idle state");
    }

    @Override
    public void insertCard(ATM atm, Card card) throws Exception {
        atm.setAtmState(new HasCardState());
    }

    @Override
    public String toString() {
        return "IdleState";
    }
}
