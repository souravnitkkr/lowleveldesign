package org.shrayansh.observerdesignpattern.weather;

public class TVDisplayObserver implements DisplayObserver{

    private WSObservable observable;

    public TVDisplayObserver(WSObservable observable){
        this.observable=observable;
    }

    @Override
    public void update() {
        System.out.println("Update on Mobile , new temperature "+observable.getTemp());
    }
}
