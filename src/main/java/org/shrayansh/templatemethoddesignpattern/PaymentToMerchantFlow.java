package org.shrayansh.templatemethoddesignpattern;

public class PaymentToMerchantFlow extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validating the payment requests");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debiting the amount from buyer's account");
    }

    @Override
    public void calculateFees() {
        System.out.println("Charging the fees of 2% of the debited amount");
    }

    @Override
    public void creditAmount() {
        System.out.println("Crediting the amount excluding fees to merchant's account");
    }
}
