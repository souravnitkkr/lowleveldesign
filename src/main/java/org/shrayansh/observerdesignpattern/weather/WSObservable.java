package org.shrayansh.observerdesignpattern.weather;

public interface WSObservable {
    void add(DisplayObserver obj);
    void remove(DisplayObserver obj);
    void notifyObserver();
    void setTemp(int temp);
    int getTemp();
}
