package org.shrayansh.observerdesignpattern.weather;

public class DriverMain {
    public static void main(String[] args) {
        WSObservable observable=new WSObservableImpl(25);

        DisplayObserver tvDisplayObserver=new TVDisplayObserver(observable);
        DisplayObserver mobileDisplayObserver=new TVDisplayObserver(observable);

        observable.add(tvDisplayObserver);
        observable.add(mobileDisplayObserver);

        observable.setTemp(25);
        observable.setTemp(35);
    }
}
