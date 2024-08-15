package org.shrayansh.observerdesignpattern.observable;

import org.shrayansh.observerdesignpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStocksObservableImpl implements StocksObservable{
    private List<NotificationAlertObserver> notificationAlertObserverList=new ArrayList<>();
    private int stockCount=0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }
    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.remove(notificationAlertObserver);
    }
    @Override
    public void notifyObserver() {
        for(NotificationAlertObserver obj:notificationAlertObserverList){
            obj.update();
        }
    }
    @Override
    public int getStockCount() {
        return stockCount;
    }
    @Override
    public void setStockCount(int newStockAdded) {
        if(this.stockCount == 0)
            notifyObserver();
        this.stockCount += newStockAdded;
    }
}
