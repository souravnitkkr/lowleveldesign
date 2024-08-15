package org.shrayansh.observerdesignpattern.weather;

import java.util.ArrayList;
import java.util.List;

public class WSObservableImpl implements WSObservable{

    private List<DisplayObserver> displayList;

    int currentTemp;

    public WSObservableImpl(int currentTemp){
        this.currentTemp=currentTemp;
        displayList=new ArrayList<>();
    }

    @Override
    public void add(DisplayObserver obj) {
        displayList.add(obj);
    }

    @Override
    public void remove(DisplayObserver obj) {
        displayList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for(DisplayObserver observer:displayList){
            observer.update();
        }
    }

    @Override
    public void setTemp(int newTemp) {
        if(currentTemp != newTemp) {
            currentTemp=newTemp;
            notifyObserver();
        }
        else
            currentTemp=newTemp;
    }

    @Override
    public int getTemp() {
        return currentTemp;
    }
}
