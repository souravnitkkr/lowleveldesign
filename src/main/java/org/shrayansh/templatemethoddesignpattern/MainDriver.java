package org.shrayansh.templatemethoddesignpattern;

public class MainDriver {
    public static void main(String[] args) {
        PaymentFlow paymentFlow=new PaymentToFriendFlow();
        paymentFlow.sendMoney();
    }
}
