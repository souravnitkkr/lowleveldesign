package org.shrayansh.atm;

import org.shrayansh.atm.state.ATMState;
import org.shrayansh.atm.state.IdleState;

public class ATM {
    private int atmBalance;
    private int noOfTwoThousandNotes;
    private int noOfFiveHundredNotes;
    private int noOfOneHundredNotes;
    private ATMState atmState;

    //singleton object of ATM class
    //eager initializations
    private final static ATM atm=new ATM();

    private ATM(){
    }

    public static ATM getInstance(){
        atm.setAtmState(new IdleState());
        return atm;
    }

    public void setAtmState(ATMState atmState){
        this.atmState=atmState;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void printCurrentATMState(){
        System.out.println(atmState);
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes){
        this.atmBalance=atmBalance;
        this.noOfTwoThousandNotes=noOfTwoThousandNotes;
        this.noOfFiveHundredNotes=noOfFiveHundredNotes;
        this.noOfOneHundredNotes=noOfOneHundredNotes;
    }


    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public void setNoOfTwoThousandNotes(int noOfTwoThousandNotes) {
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public void setNoOfFiveHundredNotes(int noOfFiveHundredNotes) {
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
    }

    public void setNoOfOneHundredNotes(int noOfOneHundredNotes) {
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }
}
