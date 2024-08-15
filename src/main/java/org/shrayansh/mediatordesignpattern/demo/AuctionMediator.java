package org.shrayansh.mediatordesignpattern.demo;

public interface AuctionMediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder,int amount);
}
