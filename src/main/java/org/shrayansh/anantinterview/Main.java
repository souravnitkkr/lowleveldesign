package org.shrayansh.anantinterview;

public class Main {
    public static void main(String[] args) {
        Observable observable=new Observable("Hello World!");
        observable.addObserver(new AObserver());
        observable.addObserver(new BObserver());

        observable.setMsg("Hello");
    }
}
