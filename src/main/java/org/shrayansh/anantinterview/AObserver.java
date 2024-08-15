package org.shrayansh.anantinterview;

public class AObserver implements Observer{
    @Override
    public void observe(String msg) {
        System.out.println("A receive message : "+msg);
    }
}
