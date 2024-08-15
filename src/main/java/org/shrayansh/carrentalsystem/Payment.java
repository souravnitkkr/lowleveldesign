package org.shrayansh.carrentalsystem;

public class Payment {
    private Bill bill;

    public Payment(Bill bill) {
        this.bill = bill;
    }

    public void payBill(){
        System.out.println("Bill is updating "+bill);
        bill.updateIsPaid();
    }
}
