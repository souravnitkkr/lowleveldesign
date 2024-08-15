package org.shrayansh.mediatordesignpattern;

public interface Colleague {

    void placeBid(int bidAmount);
    void receiveBidNotification(Colleague colleague, int bidAmount);
    String getName();
}
