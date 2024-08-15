package org.shrayansh.observerdesignpattern.observable;

import org.shrayansh.observerdesignpattern.observer.NotificationAlertObserver;

import java.util.List;

public interface StocksObservable {
    void add(NotificationAlertObserver notificationAlertObserver);
    void remove(NotificationAlertObserver notificationAlertObserver);
    void notifyObserver();
    int getStockCount();
    void setStockCount(int count);
}
