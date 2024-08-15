package org.shrayansh.mediatordesignpattern.demo;

public interface Colleague {
    void placeBid(int amount);
    void receiveNotification(Colleague colleague, int amount);
    String getName();
}
