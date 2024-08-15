package org.shrayansh.atm.chainofresponsibility;

import org.shrayansh.atm.ATM;

public class TwoThousandWithdrawalProcessor extends CashWithdrawalProcessor{
    public TwoThousandWithdrawalProcessor(CashWithdrawalProcessor nextCashWithdrawal) {
        super(nextCashWithdrawal);
    }

    @Override
    public void withDraw(ATM atm, int remainingAmount) {

        int noOfTwoThousandNotesRequired=remainingAmount/2000;
        int noOfTwoThousandNotesWithdrew=Math.min(noOfTwoThousandNotesRequired,atm.getNoOfTwoThousandNotes());

        System.out.println("Number of two thousand withdrew is "+noOfTwoThousandNotesWithdrew);

        atm.setNoOfTwoThousandNotes(atm.getNoOfTwoThousandNotes()-noOfTwoThousandNotesWithdrew);
        atm.setAtmBalance(atm.getAtmBalance()-2000*noOfTwoThousandNotesWithdrew);

        remainingAmount-=2000*noOfTwoThousandNotesWithdrew;

        if(remainingAmount != 0)
            super.withDraw(atm, remainingAmount);
    }
}
