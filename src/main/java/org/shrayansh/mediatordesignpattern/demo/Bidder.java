package org.shrayansh.mediatordesignpattern.demo;

public class Bidder implements Colleague{

    AuctionMediator auctionMediator;
    String name;

    public Bidder(AuctionMediator auctionMediator, String name) {
        this.auctionMediator = auctionMediator;
        this.name = name;
    }

    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(this,amount);
    }

    @Override
    public void receiveNotification(Colleague colleague, int amount) {
        System.out.println(getName() + " received notification about bidder " + colleague.getName()+ "placing bid of "+amount);
    }

    public String getName(){
        return name;
    }

}
