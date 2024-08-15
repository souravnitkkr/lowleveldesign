package org.shrayansh.observerdesignpattern;

import org.shrayansh.observerdesignpattern.observable.IPhoneStocksObservableImpl;
import org.shrayansh.observerdesignpattern.observable.StocksObservable;
import org.shrayansh.observerdesignpattern.observer.EmailAlertObserverImpl;
import org.shrayansh.observerdesignpattern.observer.MobileAlertObserverImpl;
import org.shrayansh.observerdesignpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;

public class DriverClass {
    public static void main(String[] args) {
        StocksObservable iPhoneStocksObservable=new IPhoneStocksObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl(iPhoneStocksObservable,"kusouravbgpr@gmail.com");
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl(iPhoneStocksObservable,"9587751346");
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl(iPhoneStocksObservable, "gulam.waris@gmail.com");

//        iPhoneStocksObservable.add(observer1);
//        iPhoneStocksObservable.add(observer2);
//        iPhoneStocksObservable.add(observer3);

        iPhoneStocksObservable.setStockCount(10);
        iPhoneStocksObservable.setStockCount(100);

    }
}
