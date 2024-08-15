package org.shrayansh.mediatordesignpattern;

public class Bidder implements Colleague{

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this,bidAmount);
    }

    @Override
    public void receiveBidNotification(Colleague colleague, int bidAmount) {
        System.out.println("Hi :"+name+ " , "+ colleague.getName() +" placed a bid of amount "+bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }


}
