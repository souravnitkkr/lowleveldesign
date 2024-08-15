package org.shrayansh.atm.chainofresponsibility;

import org.shrayansh.atm.ATM;

public class OneHundredWithdrawalProcessor extends CashWithdrawalProcessor{
    public OneHundredWithdrawalProcessor(CashWithdrawalProcessor nextCashWithdrawal) {
        super(nextCashWithdrawal);
    }

    @Override
    public void withDraw(ATM atm, int remainingAmount) {

        int noOfOneHundredNotesRequired=remainingAmount/100;
        int noOfOneHundredNotesWithdrew=Math.min(noOfOneHundredNotesRequired,atm.getNoOfOneHundredNotes());

        System.out.println("Number of one hundred withdrew is "+noOfOneHundredNotesWithdrew);

        atm.setNoOfOneHundredNotes(atm.getNoOfOneHundredNotes()-noOfOneHundredNotesWithdrew);
         atm.setAtmBalance(atm.getAtmBalance()-100*noOfOneHundredNotesWithdrew);

        remainingAmount-=100*noOfOneHundredNotesWithdrew;

        if(remainingAmount != 0)
            super.withDraw(atm, remainingAmount);
    }
}
