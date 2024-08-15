package org.shrayansh.observerdesignpattern.observer;

import org.shrayansh.observerdesignpattern.observable.StocksObservable;

import java.util.List;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    private StocksObservable stocksObservable;
    private String mobileNumber;

    public MobileAlertObserverImpl(StocksObservable stocksObservable,String mobileNumber) {
        this.stocksObservable = stocksObservable;
        this.mobileNumber = mobileNumber;
        this.stocksObservable.add(this);
    }

    @Override
    public void update() {
        sendSMS(mobileNumber,"Hurry up, Item is in stock");
    }

    private void sendSMS(String mobileNumber, String msg) {
        System.out.println("Send sms to this mobile number " +mobileNumber);
        System.out.println("Message body: "+msg);
    }
}
