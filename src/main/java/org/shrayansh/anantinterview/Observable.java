package org.shrayansh.anantinterview;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    String msg;
    List<Observer> observerList;

    public Observable(String msg) {
        this.msg = msg;
        observerList=new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void setMsg(String msg){
        this.msg=msg;
        notifyObserver(msg);
    }

    private void notifyObserver(String msg) {
        if(observerList.isEmpty())
            System.out.println("There is no observer for msg : "+msg);
        else{
            for(Observer observer:observerList){
                observer.observe(msg);
            }
        }
    }


}
