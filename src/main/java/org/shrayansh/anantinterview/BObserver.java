package org.shrayansh.anantinterview;

public class BObserver implements Observer{
    @Override
    public void observe(String msg) {
        System.out.println("B receive message : "+msg);
    }
}
