package org.shrayansh.atm.chainofresponsibility;

import org.shrayansh.atm.ATM;

public abstract class CashWithdrawalProcessor {
    private CashWithdrawalProcessor nextCashWithdrawal;

    public CashWithdrawalProcessor(CashWithdrawalProcessor nextCashWithdrawal){
        this.nextCashWithdrawal=nextCashWithdrawal;
    }

    public void withDraw(ATM atm,int remainingAmount){
        if(nextCashWithdrawal != null){
            nextCashWithdrawal.withDraw(atm, remainingAmount);
        }
    }

}
