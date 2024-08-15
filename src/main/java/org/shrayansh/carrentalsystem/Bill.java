package org.shrayansh.carrentalsystem;

public class Bill {
    private Reservation res;
    private boolean isPaid;
    private double amount;

    public Bill(double amount, Reservation res) {
        this.amount = amount;
        this.res = res;
        this.isPaid=false;
    }

    public Reservation getRes() {
        return res;
    }

    public void setRes(Reservation res) {
        this.res = res;
    }

    public void updateIsPaid() {
        isPaid=true;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "res=" + res +
                ", isPaid=" + isPaid +
                ", amount=" + amount +
                '}';
    }
}
