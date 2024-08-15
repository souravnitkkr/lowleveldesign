package org.shrayansh.templatemethoddesignpattern;

public class PaymentToFriendFlow extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validating the payment requests");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debiting the amount from sender friend's account");
    }

    @Override
    public void calculateFees() {
        System.out.println("I am not charging any fees for friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Crediting the full amount to receiver friend's account");
    }

}
