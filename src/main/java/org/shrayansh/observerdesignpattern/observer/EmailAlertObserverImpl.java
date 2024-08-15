package org.shrayansh.observerdesignpattern.observer;

import org.shrayansh.observerdesignpattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    private StocksObservable stocksObservable;
    private String emailId;
    public EmailAlertObserverImpl(StocksObservable stocksObservable,String emailId) {
        this.stocksObservable = stocksObservable;
        this.emailId = emailId;
        this.stocksObservable.add(this);
    }
    @Override
    public void update() {
        sendMail(emailId, "Hurry up, Item is in stock");
    }
    private void sendMail(String emailId, String msg) {
        System.out.println("Send mail to emailId "+emailId);
        System.out.println("Mail body: "+msg);
    }
}
