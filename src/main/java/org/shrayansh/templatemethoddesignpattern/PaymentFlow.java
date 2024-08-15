package org.shrayansh.templatemethoddesignpattern;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void debitAmount();
    public abstract void calculateFees();
    public abstract void creditAmount();
    final void sendMoney(){

        //Step:1
        validateRequest();

        //Step:2
        debitAmount();

        //Step:3
        calculateFees();

        //Step:4
        creditAmount();
    }
}
