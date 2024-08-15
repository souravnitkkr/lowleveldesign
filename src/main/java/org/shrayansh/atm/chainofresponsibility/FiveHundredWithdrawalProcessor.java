package org.shrayansh.atm.chainofresponsibility;

import org.shrayansh.atm.ATM;

public class FiveHundredWithdrawalProcessor extends CashWithdrawalProcessor{
    public FiveHundredWithdrawalProcessor(CashWithdrawalProcessor nextCashWithdrawal) {
        super(nextCashWithdrawal);
    }

    @Override
    public void withDraw(ATM atm, int remainingAmount) {

        int noOfFiveHundredNotesRequired=remainingAmount/500;
        int noOfFiveHundredNotesWithdrew=Math.min(noOfFiveHundredNotesRequired,atm.getNoOfFiveHundredNotes());

        System.out.println("Number of five hundred withdrew is "+noOfFiveHundredNotesWithdrew);

        atm.setNoOfFiveHundredNotes(atm.getNoOfFiveHundredNotes()-noOfFiveHundredNotesWithdrew);
        atm.setAtmBalance(atm.getAtmBalance()-500*noOfFiveHundredNotesWithdrew);

        remainingAmount-=500*noOfFiveHundredNotesWithdrew;

        if(remainingAmount != 0)
            super.withDraw(atm, remainingAmount);
    }
}
