package org.shrayansh.observerdesignpattern.weather;

public class MobileDisplayObserver implements DisplayObserver{
    WSObservable observable;

    public MobileDisplayObserver(WSObservable observable){
        this.observable=observable;
    }

    @Override
    public void update() {
        System.out.println("Update on Mobile , new temperature "+observable.getTemp());
    }
}
